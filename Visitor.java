interface Visitor {
    void visit(FullTimeEmployee employee);
    void visit(PartTimeEmployee employee);
    void visit(Azubi employee);
}