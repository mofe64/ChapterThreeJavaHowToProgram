package com.company;

public class Invoice {
        private String partNumber;
        private String partDescription;
        private int itemQuantity;
        private double pricePerItem;

        public Invoice(String partNumber, String partDescription, int itemQuantity, double pricePerItem ) {
            this.partNumber = partNumber;
            this.partDescription = partDescription;
            this.itemQuantity = itemQuantity;
            this.pricePerItem = pricePerItem;
        }

        public void setPartNumber(String partNumber) {
            this.partNumber = partNumber;
        }

        public String getPartNumber(){
            return partNumber;
        }

        public void setPartDescription(String partDescription) {
            this.partDescription = partDescription;
        }

        public String getPartDescription(){
            return partDescription;
            //System.out.println("test");
        }

        public void setItemQuantity(int itemQuantity){
            this.itemQuantity = itemQuantity;
        }

        public int getItemQuantity(){
            return itemQuantity;
        }

        public void setPricePerItem (double pricePerItem){
            this.pricePerItem = pricePerItem;
        }

        public double getPricePerItem(){
            return pricePerItem;
        }

        public double getInvoiceAmount(){
            double invoiceAmount;
            if(this.itemQuantity > 0 && this.pricePerItem > 0) {
                invoiceAmount=this.itemQuantity * this.pricePerItem;
            }else {
                invoiceAmount =0.0;
            }
            return invoiceAmount;

        }

}
