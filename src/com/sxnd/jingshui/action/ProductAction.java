package com.sxnd.jingshui.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.ProductBiz;
import com.sxnd.jingshui.biz.ProductcasetypeBiz;
import com.sxnd.jingshui.biz.ProducttypeBiz;
import com.sxnd.jingshui.entity.Product;
import com.sxnd.jingshui.entity.Productcasetype;
import com.sxnd.jingshui.entity.Producttype;

public class ProductAction extends ActionSupport {
	
	//封装上传的图像信息
	private File image;
	private String imageContentType;
	private String imageFileName;
	
	//文件下载的信息
	private String fileName;
	private InputStream inputStream;
	
	private Map session;
	private Integer pages;
	private Integer nextpage;
	private Integer backpage;
	private Integer nowpage;
	private Product product;
	private ProductBiz productBiz;
	private Integer ptid;
	private ProducttypeBiz producttypeBiz;
	private List<Producttype> producttypeList;
	private Integer pid;
	private ProductcasetypeBiz productcasetypeBiz;
	private List<Productcasetype> productcasetypeList;
	private List<Product> productList;
	private String delemanyIds;
	

	public String fenyeproduct() throws Exception{
		
		
		System.out.println("prsssssssssssss:");
		session = ActionContext.getContext().getSession();
		if(nowpage==null ||nowpage==0){
			nowpage=1;
		}
		productList = productBiz.findproduct(nowpage, ptid);
		producttypeList = producttypeBiz.findproducttype();
		
		System.out.println("producttypeList1:"+producttypeList);
		pages = productBiz.findProductpages(ptid);
		if(pid!=null&&!"".equals(pid))
		product = productBiz.findproductById(pid);
		backpage = nowpage-1;
		if(backpage<1)
			backpage = 1;
		nextpage = nowpage+1;
		if(nextpage>pages)
			nextpage = pages;
		
		
		session.put("productList",productList);
		/*session.put("producttypeList", producttypeList);*/
		System.out.println("productList:"+productList.size());
		System.out.println("producttypeList:"+producttypeList);
		return "findproduct_success";
		
	}
	public String findproductById() throws Exception{
		System.out.println("进入findproductById");
		try {
			product = productBiz.findproductById(pid);
	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "findproductById_success";
		
	}
	public String delete() throws Exception{
		try{
			productBiz.deleteProdunct(pid);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "delete_success";
		
	}
	public String deleteMany(){
		try {
			
			
			String[] ids = delemanyIds.split(",");
			for(String idStr : ids){
				productBiz.deleteProdunct(Integer.parseInt(idStr));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "deletemany_success";
		
	}
	
	
	//前往add页面
	public String toaadd() {
		try {
			producttypeList =  producttypeBiz.findproducttype();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "toaadd_success";
	}
		//添加产品的方法
		public String add() throws Exception{
			
			System.out.println("sss");
			//Map session = ActionContext.getContext().getSession();
				System.out.println("bbb");
				/*product = (Product) session.get("product");*/
				System.out.println("aaaaaaaaaaa");
				try{
					if(image!=null){
						String path = ServletActionContext.getRequest().getRealPath("/images/"+imageFileName);
						System.out.println("ccccccc");
						//通过文件流的方式，把上传的图片放到images文件下
						FileInputStream fis = new FileInputStream(image);
						FileOutputStream fos = new FileOutputStream(path);
						System.out.println("dddddddd");
						byte[] temp = new byte[1024];
						int size = -1;
						do{
							size = fis.read(temp);
							if(size!=-1){
								System.out.println("aaaaaas");
								fos.write(temp,0,size);
								}
							}while(size!=-1);
							fos.flush();
							fos.close();
							fis.close();
						product.setPImg(imageFileName);
					}
					System.out.println(product.toString());
					int num = productBiz.addproduct(product);
					producttypeList = producttypeBiz.findproducttype();
					System.out.println("product:"+product);
					}catch (Exception e) {
						e.printStackTrace();
					}
				
			return "add_success";
			
		}
		
		
		//跳转编辑页面
		public String toupdateproduct(){
			try{
				producttypeList =  producttypeBiz.findproducttype();
				product = productBiz.findproductById(pid);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "toupdateproduct_success";
			
		}
		
		//修改产品列表
		public String updateproduct(){
			
			try {
				
				if(image!=null){
					String path = ServletActionContext.getRequest().getRealPath("/images/"+imageFileName);
					System.out.println("ccccccc");
					//通过文件流的方式，把上传的图片放到images文件下
					FileInputStream fis = new FileInputStream(image);
					FileOutputStream fos = new FileOutputStream(path);
					System.out.println("dddddddd");
					byte[] temp = new byte[1024];
					int size = -1;
					do{
						size = fis.read(temp);
						if(size!=-1){
							System.out.println("aaaaaas");
							fos.write(temp,0,size);
							}
						}while(size!=-1);
						fos.flush();
						fos.close();
						fis.close();
					product.setPImg(imageFileName);
				}
				productBiz.updateproduct(product);
				producttypeList = producttypeBiz.findproducttype();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "update_success";
			
		}
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getNextpage() {
		return nextpage;
	}
	public void setNextpage(Integer nextpage) {
		this.nextpage = nextpage;
	}
	public Integer getBackpage() {
		return backpage;
	}
	public void setBackpage(Integer backpage) {
		this.backpage = backpage;
	}
	public Integer getNowpage() {
		return nowpage;
	}
	public void setNowpage(Integer nowpage) {
		this.nowpage = nowpage;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ProductBiz getProductBiz() {
		return productBiz;
	}
	public void setProductBiz(ProductBiz productBiz) {
		this.productBiz = productBiz;
	}
	public Integer getPtid() {
		return ptid;
	}
	public void setPtid(Integer ptid) {
		this.ptid = ptid;
	}
	public ProducttypeBiz getProducttypeBiz() {
		return producttypeBiz;
	}
	public void setProducttypeBiz(ProducttypeBiz producttypeBiz) {
		this.producttypeBiz = producttypeBiz;
	}
	public List<Producttype> getProducttypeList() {
		return producttypeList;
	}
	public void setProducttypeList(List<Producttype> producttypeList) {
		this.producttypeList = producttypeList;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public ProductcasetypeBiz getProductcasetypeBiz() {
		return productcasetypeBiz;
	}
	public void setProductcasetypeBiz(ProductcasetypeBiz productcasetypeBiz) {
		this.productcasetypeBiz = productcasetypeBiz;
	}
	public List<Productcasetype> getProductcasetypeList() {
		return productcasetypeList;
	}
	public void setProductcasetypeList(List<Productcasetype> productcasetypeList) {
		this.productcasetypeList = productcasetypeList;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public String getImageContentType() {
		return imageContentType;
	}
	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getDelemanyIds() {
		return delemanyIds;
	}
	public void setDelemanyIds(String delemanyIds) {
		this.delemanyIds = delemanyIds;
	}
	

}
