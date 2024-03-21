package entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate date;
    private Double amount;
    public Installment(LocalDate Date, Double amount) {
        this.date = Date;
        this.amount = amount;
    }
    public LocalDate getDueDate() {
        return date;
    }
    public void setdate(LocalDate date) {
        this.date = date;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return date.format(fmt) + " - " + String.format("%.2f", amount);
    }

    

}
