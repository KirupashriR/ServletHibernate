package com.digit.hibernate.servlet.model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import java.util.List;
import java.util.Iterator;
import com.digti.hibernate.servlet.bean.AadharDetails;
public class HibernateManager {
	private Session session;

	public HibernateManager() {
		Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistryBuilder builder=new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory=configuration.buildSessionFactory(builder.buildServiceRegistry());
		session=sessionFactory.openSession();
		System.out.println("Connected to pf....");
	}
	public boolean saveObj(AadharDetails ad) {
		Transaction tran=session.beginTransaction();
		session.save(ad);
		tran.commit();
		System.out.println("Object saved");
		return true;
	}
	public boolean update(int id,String name) {
		Transaction transaction=session.beginTransaction();
		AadharDetails ad=(AadharDetails) session.get(AadharDetails.class, id);
		ad.setName(name);
		session.update(ad);
		System.out.println("Update success");
		transaction.commit();
		return true;
	}
	public boolean delete(int id) {
		Transaction transaction=session.beginTransaction();
		AadharDetails ad=(AadharDetails) session.get(AadharDetails.class, id);
		session.delete(ad);
		System.out.println("Delete success");
		transaction.commit();
		return true;
	}
	public AadharDetails readSpecific(int id) {
		Transaction tran=session.beginTransaction();
		AadharDetails ad=(AadharDetails) session.get(AadharDetails.class, id);
		return ad;
	}
	/*public AadharDetails readAll() {
		Transaction tran=session.beginTransaction();
		Query q=session.createQuery("From Aadhar");
		List li=q.list();
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			AadharDetails ad=(AadharDetails) itr.next();
		}
		return ad;
		tran.commit();
	}*/
	
}
