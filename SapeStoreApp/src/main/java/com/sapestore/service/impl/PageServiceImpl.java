package com.sapestore.service.impl;

import com.sapestore.common.SapeStoreLogger;
import com.sapestore.dao.PagesDao;
import com.sapestore.exception.SapeStoreException;

import com.sapestore.service.PageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Service class for editing static content like Contacts Us and Privacy Policy. 
 * CHANGE LOG 
 * VERSION    DATE       AUTHOR    MESSAGE 
 * 1.0     20-06-2014   SAPIENT Initial version
 * 1.0     29-10-2015    cgarg1 
 */

@Service("pageService")
public class PageServiceImpl implements PageService {

  private static final SapeStoreLogger LOGGER = SapeStoreLogger
      .getLogger(PageServiceImpl.class.getName());

  @Autowired
  private PagesDao pagesDao;

  @Override
  public String getContactUs() throws SapeStoreException {
    LOGGER.debug("getContactUs method: START");
    String contactUsText = null;
    contactUsText = pagesDao.getContactUs();
    LOGGER.debug("getContactUs method: END");
    return contactUsText;
  }

  @Override
  public void setContactUs(String contactText) throws SapeStoreException {
    pagesDao.setContactUs(contactText);
  }

  @Override
  public String getPolicy() throws SapeStoreException {
    String policyText = pagesDao.getPolicy();
    return policyText;
  }

  @Override
  public void setPolicy(String policyText) throws SapeStoreException {
    pagesDao.setPolicy(policyText);   
  }

}
