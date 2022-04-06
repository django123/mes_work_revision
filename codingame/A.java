package codingame;

class A {

    /**
     * Executes the service with the given connection.
     */
    void a(Service s, Connection c)throws Exception {
        // update this code
        try {
            s.setConnection(c);
            s.execute();
            c.commit(); // si ok on commit
        } catch (Exception e) {
            c.rollback(); //si echec on rollback
        }finally{
            c.close(); // dans tous les cas on applelle close
        }

    }

    interface Service {
        void execute() throws Exception;

        void setConnection(Connection c);
    }

    interface Connection {
        void commit();

        void rollback();

        void close();
    }
}
