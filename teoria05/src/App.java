import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ContaDao dao;
        String url = "jdbc:postgresql://aws-1-us-east-1.pooler.supabase.com:6543/postgres?user=postgres.zuwmidevfxstazryemej&password=j37eg0qww2e";
        dao = new ContaDao(ConnectionFactory.getConnection(url));
        List<Conta> contas;
        contas = dao.lerTodas();
        System.out.println(contas);
        Conta conta = dao.buscarPeloNumero(101);
        System.out.println(conta);
    }
}
