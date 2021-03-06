/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcInputOptionSelfCloseField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputOptionSelfCloseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputOptionSelfCloseField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcInputOptionSelfCloseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_InstrumentID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseRef(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_OptionSelfCloseRef_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseRef() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_OptionSelfCloseRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_UserID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_BusinessUnit_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_HedgeFlag_get(swigCPtr, this);
  }

  public void setOptSelfCloseFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_OptSelfCloseFlag_set(swigCPtr, this, value);
  }

  public char getOptSelfCloseFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_OptSelfCloseFlag_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_CurrencyID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_ClientID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOptionSelfCloseField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputOptionSelfCloseField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcInputOptionSelfCloseField(), true);
  }

}
