/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attori;

import ambiente.Mappa;
import java.awt.Image;

/**
 *
 * @author User
 */
public final class Ondata {

    private final int n;
    private Image immaginemob;

    private int vitaMob;
    private int velMob;
    private int guadagnoMob;

    private final int dimPiastrella;

//    private final int idondata;
    private final Mob[] mobs;
    private final Mappa mappa;

    /**
     *
     * @return
     */
    public Mappa getMappa() {
        return mappa;
    }
    
    /**
     *
     * @return
     */
    public Mob[] getMobs() {
        return mobs;
    }
    
    /**
     *
     * @return
     */
    public int getVitaMob() {
        return vitaMob;
    }

    /**
     *
     * @param vitaMob
     */
    public void setVitaMob(int vitaMob) {
        this.vitaMob = vitaMob;
    }

    /**
     *
     * @return
     */
    public int getVelMob() {
        return velMob;
    }

    /**
     *
     * @param velMob
     */
    public void setVelMob(int velMob) {
        this.velMob = velMob;
    }

    //costruttore di ondata

    /**
     *
     * @param mappa
     * @param n
     * @param vitaMob
     * @param velMob
     * @param guadagnoMob
     * @param dimPiastrella
     * @param immaginemob
     */
    public Ondata(Mappa mappa, int n, int vitaMob, int velMob, int guadagnoMob,int dimPiastrella, Image immaginemob) {
        this.mappa = mappa;
        this.immaginemob= immaginemob;
        this.n = n;//numero mob dell'ondata e quindi dimensione del vettore Mob
        mobs = new Mob[n];//istanziazione di un vetore di Mob di dimensione n
//        idondata = 0;
        this.vitaMob = vitaMob;
        this.velMob = velMob;

        this.dimPiastrella = dimPiastrella;
        this.guadagnoMob=guadagnoMob;
        riempiOndata();//chiamata al metodo riempiOndata

    }

    //il metodo riempiOndata scorre il vettore Mob e istanzia tutti mob fino a riempire il vettore

    /**
     *
     */
    public void riempiOndata() {
        for (int i = 0; i < n; i++) {

            mobs[i] = new Mob(mappa.getPartenza(), velMob, i, vitaMob, guadagnoMob, dimPiastrella,immaginemob);

        }

    }

    /**
     *
     * @return
     */
    public int getN() {
        return n;
    }

}
