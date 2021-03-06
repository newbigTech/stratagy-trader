/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcQryOptionInstrTradeCostField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryOptionInstrTradeCostField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryOptionInstrTradeCostField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcQryOptionInstrTradeCostField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_HedgeFlag_get(swigCPtr, this);
  }

  public void setInputPrice(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_InputPrice_set(swigCPtr, this, value);
  }

  public double getInputPrice() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_InputPrice_get(swigCPtr, this);
  }

  public void setUnderlyingPrice(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_UnderlyingPrice_set(swigCPtr, this, value);
  }

  public double getUnderlyingPrice() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_UnderlyingPrice_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryOptionInstrTradeCostField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQryOptionInstrTradeCostField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcQryOptionInstrTradeCostField(), true);
  }

}
