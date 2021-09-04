package com.itbaizhan.service;

import java.util.List;

import org.hibernate.*;

import com.itbaizhan.ORM.*;
import com.itbaizhan.base.BaseLog;

/** 锟斤拷品锟斤拷锟洁、锟斤拷品锟斤拷锟截硷拷锟斤拷品业锟斤拷锟竭硷拷锟斤拷锟斤拷涌锟绞碉拷锟� */
public class MerServiceImpl extends BaseLog implements MerService {

	/** 锟斤拷锟斤拷锟斤拷品锟斤拷锟斤拷 */
	public boolean addCategory(Category cate) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		boolean status = false;
		try{
			tx = session.beginTransaction();
			session.save(cate);
			tx.commit();
			status = true;
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷addCategory锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return status;
	}
	
	/** 锟斤拷锟斤拷锟狡凤拷锟斤拷锟� */
	public List browseCategory() throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		List list = null;
		try{
			Query query = session.createQuery("from Category as a order by a.id");
			tx = session.beginTransaction();
			list = query.list();
			tx.commit();
			if (!Hibernate.isInitialized(list))Hibernate.initialize(list);
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷browseCategory锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return list;
	}
	
	/** 删锟斤拷指锟斤拷锟斤拷锟斤拷品锟斤拷锟斤拷 */	
	public boolean delCategory(Integer id) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		boolean status = false;
		try{
			tx = session.beginTransaction();
			Category cate = (Category)session.load(Category.class, id);
			session.delete(cate);
			tx.commit();
			status = true;
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷delCategory锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return status;
	}
	
	/** 装锟斤拷指锟斤拷锟斤拷锟斤拷品锟斤拷锟斤拷 */
	public Category loadCategory(Integer id) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		Category cate = null;
		try{
			tx = session.beginTransaction();
			cate = (Category)session.get(Category.class, id);
			tx.commit();
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷loadCategory锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return cate;
	}

	/** 锟斤拷锟斤拷锟斤拷品锟斤拷锟斤拷 */
	public boolean updateCategory(Category cate) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		boolean status = false;
		try{
			tx = session.beginTransaction();
			session.update(cate);
			tx.commit();
			status = true;
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷updateCategory锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return status;
	}

	/** 锟斤拷锟斤拷锟斤拷品 */
	public boolean addMer(Merchandise mer) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		boolean status = false;
		try{
			tx = session.beginTransaction();
			session.save(mer);
			tx.commit();
			status = true;
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷addMer锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return status;
	}

	/** 锟斤拷锟斤拷锟狡� */
	public List browseMer(String hql) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		List list = null;
		try{
			Query query = session.createQuery(hql);
			tx = session.beginTransaction();
			list = query.list();
			tx.commit();
			if (!Hibernate.isInitialized(list))Hibernate.initialize(list);
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷browseMer锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return list;
	}

	/** 删锟斤拷指锟斤拷锟斤拷锟斤拷品 */	
	public boolean delMer(Integer id) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		boolean status = false;
		try{
			tx = session.beginTransaction();
			Merchandise mer = (Merchandise)session.load(Merchandise.class, id);
			session.delete(mer);
			tx.commit();
			status = true;
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷delMer锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return status;
	}

	/** 装锟斤拷指锟斤拷锟斤拷锟斤拷品 */
	public Merchandise loadMer(Integer id) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		Merchandise mer = null;
		try{
			tx = session.beginTransaction();
			mer = (Merchandise)session.get(Merchandise.class, id);
			tx.commit();
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷loadMer锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return mer;
	}

	/** 锟斤拷锟斤拷锟斤拷品 */
	public boolean updateMer(Merchandise mer) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		boolean status = false;
		try{
			tx = session.beginTransaction();
			session.update(mer);
			tx.commit();
			status = true;
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷updateMer锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return status;
	}

	/** 锟斤拷页锟斤拷锟斤拷锟狡� */
	public List browseMer(int pageSize, int pageNo, int cateId,boolean isSpecial) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		List list = null;
		try{
			String hql = "from Merchandise as a";
			if (isSpecial){	//锟截硷拷锟斤拷品
				hql = hql + " where a.special=1";
			}else{ //锟斤拷通锟斤拷品
				hql = hql + " where a.special=0";				
			}
			if (cateId!=0){ //指锟斤拷锟斤拷锟�
				hql = hql + " and a.category.id="+cateId;
			}
			hql = hql + " order by a.id desc";
			Query query = session.createQuery(hql);
			query.setMaxResults(pageSize);
			query.setFirstResult((pageNo-1)*pageSize);
			tx = session.beginTransaction();
			list = query.list();
			tx.commit();
			if (!Hibernate.isInitialized(list))Hibernate.initialize(list);
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷browseMer锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return list;
	}

	/** 锟斤拷锟斤拷锟斤拷品 */
	public List browseMer(int pageSize, int pageNo, String hql) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		List list = null;
		try{
			Query query = session.createQuery(hql);
			query.setMaxResults(pageSize);
			query.setFirstResult((pageNo-1)*pageSize);
			tx = session.beginTransaction();
			list = query.list();
			tx.commit();
			if (!Hibernate.isInitialized(list))Hibernate.initialize(list);
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷browseMer锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return list;
	}
	
	/** 统锟狡硷拷录锟斤拷锟斤拷 */
	public int countRecord(String hql) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		int count = 0;
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setMaxResults(1);
			count = ((Integer)query.uniqueResult()).intValue();
			tx.commit();
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("锟斤拷执锟斤拷MerServiceImpl锟斤拷锟叫碉拷countRecord锟斤拷锟斤拷时锟斤拷锟�?\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return count;
	}
}