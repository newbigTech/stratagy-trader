/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.zd.jctp;

public class CThostFtdcQryInvestorProductGroupMarginField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryInvestorProductGroupMarginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInvestorProductGroupMarginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcQryInvestorProductGroupMarginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_InvestorID_get(swigCPtr, this);
  }

  public void setProductGroupID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_ProductGroupID_set(swigCPtr, this, value);
  }

  public String getProductGroupID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_ProductGroupID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_HedgeFlag_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryInvestorProductGroupMarginField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQryInvestorProductGroupMarginField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcQryInvestorProductGroupMarginField(), true);
  }

}