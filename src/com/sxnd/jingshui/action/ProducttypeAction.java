package com.sxnd.jingshui.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.ProducttypeBiz;
import com.sxnd.jingshui.entity.Producttype;

public class ProducttypeAction extends ActionSupport {
	
	public ProducttypeAction(){
		System.out.println("进来了");
	}
	
	private ProducttypeBiz producttypeBiz;
	private List<Producttype> producttypeList;
	private Integer ptid;
	private Producttype producttype;
	private int ppid;
	//封装上传的图像信息
	private File image;
	private String imageContentType;
	private String imageFileName;
	
	//文件下载的信息
	private String fileName;
	private InputStream inputStream;
	
	public String findpt() throws Exception {
		try {
			producttypeList = producttypeBiz.findproducttype();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "findpt_success";
	}
	
	public String deletept(){
		try {
			
			producttypeBiz.deleteproducttype(ptid);
			System.out.println("aaa");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "deletept_success";
		
	}
	//添加产品的方法
			public String addpt() throws Exception{
				
				
				//Map session = ActionContext.getContext().getSession();
					System.out.println("进入type");
					try{
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
					producttype.setPtImg(imageFileName);
					int num = producttypeBiz.addproducttype(producttype);
					producttypeList = producttypeBiz.findproducttype();
					}catch (Exception e) {
						e.printStackTrace();
					}
				return "addpt_success";
				
			}
			public String toupdatept(){
				try{
					
					
					producttype = producttypeBiz.findproducttypeByptid(ptid); 
					producttypeList = producttypeBiz.findproducttype();
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				return "toupdatept_success";
				
			}
			//修改类型                  
			public String updatept(){
				System.out.println("aaaaa");
				try {
					
					//根据id查找类型
					producttype=producttypeBiz.findproducttypeByptid(ppid);
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
						producttype.setPtImg(imageFileName);
					}
						
						producttypeBiz.updateproducttype(producttype);
						System.out.println("producttype:"+producttype);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return "updatept_success";
				
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
	public Integer getPtid() {
		return ptid;
	}
	public void setPtid(Integer ptid) {
		this.ptid = ptid;
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
	public Producttype getProducttype() {
		return producttype;
	}
	public void setProducttype(Producttype producttype) {
		this.producttype = producttype;
	}

	public int getPpid() {
		return ppid;
	}

	public void setPpid(int ppid) {
		this.ppid = ppid;
	}
	
	
}
