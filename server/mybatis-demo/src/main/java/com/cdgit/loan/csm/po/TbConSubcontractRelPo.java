package com.cdgit.loan.csm.po;

import java.math.BigDecimal;
import java.util.Date;

public class TbConSubcontractRelPo {//TB_CON_SUBCONTRACT_REL
	   private String conSubconId;

	    private String contractId;

	    private String subcontractId;

	    private String ifEffective;

	    private BigDecimal suretyAmt;

	    private Date createTime;

	    private Date updateTime;

	    private String operationType;

	    private String subcontractIdBackups;

	    private BigDecimal subcontractAmt;

	    public String getConSubconId() {
	        return conSubconId;
	    }

	    public void setConSubconId(String conSubconId) {
	        this.conSubconId = conSubconId == null ? null : conSubconId.trim();
	    }

	    public String getContractId() {
	        return contractId;
	    }

	    public void setContractId(String contractId) {
	        this.contractId = contractId == null ? null : contractId.trim();
	    }

	    public String getSubcontractId() {
	        return subcontractId;
	    }

	    public void setSubcontractId(String subcontractId) {
	        this.subcontractId = subcontractId == null ? null : subcontractId.trim();
	    }

	    public String getIfEffective() {
	        return ifEffective;
	    }

	    public void setIfEffective(String ifEffective) {
	        this.ifEffective = ifEffective == null ? null : ifEffective.trim();
	    }

	    public BigDecimal getSuretyAmt() {
	        return suretyAmt;
	    }

	    public void setSuretyAmt(BigDecimal suretyAmt) {
	        this.suretyAmt = suretyAmt;
	    }

	    public Date getCreateTime() {
	        return createTime;
	    }

	    public void setCreateTime(Date createTime) {
	        this.createTime = createTime;
	    }

	    public Date getUpdateTime() {
	        return updateTime;
	    }

	    public void setUpdateTime(Date updateTime) {
	        this.updateTime = updateTime;
	    }

	    public String getOperationType() {
	        return operationType;
	    }

	    public void setOperationType(String operationType) {
	        this.operationType = operationType == null ? null : operationType.trim();
	    }

	    public String getSubcontractIdBackups() {
	        return subcontractIdBackups;
	    }

	    public void setSubcontractIdBackups(String subcontractIdBackups) {
	        this.subcontractIdBackups = subcontractIdBackups == null ? null : subcontractIdBackups.trim();
	    }

	    public BigDecimal getSubcontractAmt() {
	        return subcontractAmt;
	    }

	    public void setSubcontractAmt(BigDecimal subcontractAmt) {
	        this.subcontractAmt = subcontractAmt;
	    }

		@Override
		public String toString() {
			return "TbConSubcontractRelPo [conSubconId=" + conSubconId + ", contractId=" + contractId
					+ ", subcontractId=" + subcontractId + ", ifEffective=" + ifEffective + ", suretyAmt=" + suretyAmt
					+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", operationType=" + operationType
					+ ", subcontractIdBackups=" + subcontractIdBackups + ", subcontractAmt=" + subcontractAmt + "]";
		}
	    
	

}
