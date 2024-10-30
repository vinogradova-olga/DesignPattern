package org.example;

// Adapter
class PrinterAdapter implements InvoicePrinter {
    private final LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printInvoice(String invoiceDetails) {
        legacyPrinter.printDocument(invoiceDetails);
    }
}
