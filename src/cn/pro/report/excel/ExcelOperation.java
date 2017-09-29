package cn.pro.report.excel;


import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;

import cn.pro.report.entity.User;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class ExcelOperation {
	
	
	/*从excel加载用户资源*/
	public static List<User> getuser(String filepath)    
	  
    {   
		 InputStream instream = null;
        jxl.Workbook readwb = null;  
        List<User> users = new ArrayList<User>();
       
        
  
        try    
  
        {   
  
            //构建Workbook对象, 只读Workbook对象   
  
            //直接从本地文件创建Workbook   
  
            instream = new FileInputStream(filepath);   
  
            readwb = Workbook.getWorkbook(instream);   
  
    
  
            //Sheet的下标是从0开始   
  
            //获取第一张Sheet表   
  
            Sheet readsheet = readwb.getSheet(0);   
  
            //获取Sheet表中所包含的总列数   
  
           // int rsColumns = readsheet.getColumns();   
  
            //获取Sheet表中所包含的总行数   
  
            int rsRows = readsheet.getRows();   
  
            //获取指定单元格的对象引用   
            

  
            for (int i = 0; i < rsRows; i++)   
  
            {   
            	
            	Cell cell = readsheet.getCell(1, i);   
            	Cell cell2 = readsheet.getCell(2, i);
            	Cell cell3 = readsheet.getCell(3, i);
            	String ki = cell.getContents();
            	String de = cell2.getContents();
            	String name = cell3.getContents();
            	User user = new User();
            	if(check(users,ki))
            		{
            		user.setId(ki);
            		user.setCid(de);
            		user.setName(name);
            		
            		users.add(user);
            		}
  

  
            }   
            
            //利用已经创建的Excel工作薄,创建新的可写入的Excel工作薄   
          
  

  
        } catch (Exception e) {   
  
            e.printStackTrace();   
  
        } finally {   
  
            readwb.close();   
            try {
				instream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  
        }   
        return  users;
  
}   
	
public static boolean check(List<User> users,String id)
	{
		boolean bo=true;
		for(int i=0;i<users.size();i++)
		{
			if(id.equals("")||id.equals(users.get(i).getId()))
			{
				bo=false;	
			    break;
			}
		}
		return bo;
	}

public static boolean checkInt(List<Integer> a,int e)
{
	boolean bo=true;
	for(int i=0;i<a.size();i++)
	{
		if(e==a.get(i))
		{
			bo=false;	
		    break;
		}
	}
	return bo;
}



}


