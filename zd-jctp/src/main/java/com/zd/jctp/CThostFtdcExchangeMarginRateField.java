/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.zd.jctp;

public class CThostFtdcExchangeMarginRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeMarginRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeMarginRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcExchangeMarginRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcExchangeMarginRateField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcExchangeMarginRateField(), true);
  }

}