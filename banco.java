public class banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Metodos Personalizados
    public void stadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumconta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        } 
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            	System.out.println("Conta ainda não pode fechar pois tem dinheiro");
        } else if (getSaldo() < 0){
            System.out.println("Conta ainda não pode fechar pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if(this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            } 
        } else {
                System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }
    //Metodos especiais
    public banco(){
        this.saldo = 0;
        this.status = false;
    }
    
    public void setNumconta(int numConta){
        this.numConta = numConta;
    }
    
    public int getNumconta(){
        return numConta;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public String getDono(){
        return dono;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setStatus( boolean status){
        this.status = status;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    
}
