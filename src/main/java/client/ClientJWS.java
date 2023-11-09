package client;

import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

public class ClientJWS {
    public static void main(String[] args) {
        BanqueService banqueService = new BanqueServiceService().getBanqueServicePort();
        //System.out.println(banqueService.conversion(5));
        for (Compte compte:banqueService.getComptes() ) {
            System.out.println("Compte N°"+compte.getCode()+"a Solde :"+compte.getSolde()+"\n");

        }
    }
}
