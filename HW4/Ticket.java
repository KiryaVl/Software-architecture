package HW4;
//@startuml
//
//class Ticket {
//    - rootNumber: long
//    - price: double
//    - place: Integer
//    - date: LocalDateTime
//    - isValid: boolean
//    + Ticket(rootNumber: long, price: double, place: Integer, date: LocalDateTime)
//    + getRootNumber(): long
//    + getPrice(): double
//    + getPlace(): Integer
//    + getDate(): LocalDateTime
//    + isValid(): boolean
//    + cancel(): void
//}
//
//class CashProvider {
//    - card: long
//    - hashCard: long
//    - isAuthorization: boolean
//    + CashProvider(card: long, hashCard: long)
//    + authorization(customer: Customer): void
//    + buy(price: double): void
//    + cardHasFunds(amount: double): boolean
//}
//
//class Customer {
//    - id: int
//    - tickets: List<Ticket>
//    - cash: CashProvider
//    + Customer(id: int)
//    + getId(): int
//    + setCash(cash: CashProvider): void
//    + buyTicket(ticket: Ticket): boolean
//    + search(date: LocalDateTime, rootNumber: long): List<Ticket>
//}
//
//class TicketProvider {
//    - availableTickets: List<Ticket>
//    + TicketProvider()
//    + addTicket(ticket: Ticket): boolean
//    + removeTicket(ticket: Ticket): boolean
//    + getTicket(rootNumber: long): List<Ticket>
//    + updateTicketStatus(ticket: Ticket): boolean
//}
//
//    Customer o-- Ticket
//        Customer *-- CashProvider
//        Customer --> TicketProvider
//        CashProvider --> TicketProvider
//
//@enduml

import java.time.LocalDateTime;

class Ticket {
    private long rootNumber;
    private double price;
    private Integer place;
    private LocalDateTime date;
    private boolean isValid;

    public Ticket(long rootNumber, double price, Integer place, LocalDateTime date) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
        this.date = date;
        this.isValid = true;
    }

    public long getRootNumber() {
        return rootNumber;
    }

    public double getPrice() {
        return price;
    }

    public Integer getPlace() {
        return place;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber=" + rootNumber +
                ", price=" + price +
                ", place=" + place +
                ", date=" + date +
                ", isValid=" + isValid +
                '}';
    }

    public boolean isValid() {
        return isValid;
    }

    public void cancel() {
        isValid = false;
    }
}