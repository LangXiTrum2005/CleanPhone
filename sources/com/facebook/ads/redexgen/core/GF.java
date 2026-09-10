package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class GF implements View.OnTouchListener {
    public static String[] A01 = {"Ag1edxGPmMygd2ZYlIUVji8noIaHMiLQ", "WBm6rd5teeEdNPvhq6Xy4yUZakZyqmkG", "ECfpblw4grbEX8THFPRM2kFRttXYDoHg", "puAZOL7My1RDIFuoQdQlIGU8uD74vctF", "rOVXccWrouvhHaM6oOMABT92DHzQ0mnK", "DC0vFQcYgsBFza3ppzX1spbq624HEpuf", "poJar2xzbFJI41pUq505BIfUZ51x22BX", "IrxdQF8UtoekkpFzNw9qcg8fTKi13Wor"};
    public final /* synthetic */ C1580fu A00;

    public GF(C1580fu c1580fu) {
        this.A00 = c1580fu;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float browserFinalY = motionEvent.getY();
                if (this.A00.A00 >= browserFinalY) {
                    return true;
                }
                C1580fu c1580fu = this.A00;
                String[] strArr = A01;
                String str = strArr[6];
                String str2 = strArr[2];
                int iCharAt = str.charAt(3);
                int action2 = str2.charAt(3);
                if (iCharAt == action2) {
                    throw new RuntimeException();
                }
                A01[3] = "IGAgl0ADkCINtDuAhI065JcG0AD0YiJn";
                c1580fu.A0i(false);
                return true;
            default:
                return true;
        }
    }
}
