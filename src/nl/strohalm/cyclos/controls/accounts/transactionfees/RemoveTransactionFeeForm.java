/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

    Cyclos is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cyclos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cyclos; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package nl.strohalm.cyclos.controls.accounts.transactionfees;

// import org.apache.struts.action.ActionForm;
import org.apache.struts.validator.ValidatorActionForm; //SDESFIX


/**
 * Form used to remove a transaction fee
 * @author luis
 */
public class RemoveTransactionFeeForm extends ValidatorActionForm {
    private static final long serialVersionUID = 1379122735663970250L;
    private long              accountTypeId;
    private long              transferTypeId;
    private long              transactionFeeId;

    public long getAccountTypeId() {
        return accountTypeId;
    }

    public long getTransactionFeeId() {
        return transactionFeeId;
    }

    public long getTransferTypeId() {
        return transferTypeId;
    }

    public void setAccountTypeId(final long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public void setTransactionFeeId(final long transactionFeeId) {
        this.transactionFeeId = transactionFeeId;
    }

    public void setTransferTypeId(final long transferTypeId) {
        this.transferTypeId = transferTypeId;
    }
}
