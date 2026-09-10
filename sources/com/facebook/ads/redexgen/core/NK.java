package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class NK extends BroadcastReceiver {
    public static String[] A03 = {"dggRIwntGnoxWZ7BDQUg45Sl6NQgoMuN", "38c9H60yn2P1pt17", "STlEyQPStERy8tSXGvH8F24LWNUxdBhq", "hCwe", "bKRxwQpiW0PmVHVfGUn2RavmyNEFkRji", "VPPe2MO9HED0sxCZzVAB8cvkabJHsXeP", "uH31h0PRXTyVkIOgrCb5PcgaQIfZ1AyX", "pPlbIWWtmQkYN3MHTwcOdVUNUzBLXTby"};
    public AbstractC2469jh A00;
    public NJ A01;
    public String A02;

    public NK(String str, AbstractC2469jh abstractC2469jh, NJ nj) {
        this.A00 = abstractC2469jh;
        this.A01 = nj;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(EnumC2193ez.A06.A04(this.A02));
        intentFilter.addAction(EnumC2193ez.A09.A04(this.A02));
        intentFilter.addAction(EnumC2193ez.A04.A04(this.A02));
        intentFilter.addAction(EnumC2193ez.A0A.A04(this.A02));
        intentFilter.addAction(EnumC2193ez.A05.A04(this.A02));
        intentFilter.addAction(EnumC2193ez.A0C.A04(this.A02));
        intentFilter.addAction(EnumC2193ez.A0B.A04(this.A02));
        intentFilter.addAction(EnumC2193ez.A03.A04(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        EnumC2193ez enumC2193ez = EnumC2193ez.A06;
        String action2 = this.A02;
        if (enumC2193ez.A04(action2).equals(action)) {
            this.A01.AFo(this.A00);
            return;
        }
        EnumC2193ez enumC2193ez2 = EnumC2193ez.A09;
        String action3 = this.A02;
        if (enumC2193ez2.A04(action3).equals(action)) {
            if (C1750Up.A1y(context)) {
                this.A01.AFp(this.A00, AdError.AD_PRESENTATION_ERROR);
                return;
            } else {
                this.A01.AFp(this.A00, AdError.INTERNAL_ERROR);
                return;
            }
        }
        EnumC2193ez enumC2193ez3 = EnumC2193ez.A04;
        String action4 = this.A02;
        if (enumC2193ez3.A04(action4).equals(action)) {
            this.A01.AFl(this.A00);
            return;
        }
        EnumC2193ez enumC2193ez4 = EnumC2193ez.A0A;
        String action5 = this.A02;
        if (enumC2193ez4.A04(action5).equals(action)) {
            this.A01.AFn(this.A00);
            return;
        }
        EnumC2193ez enumC2193ez5 = EnumC2193ez.A05;
        String action6 = this.A02;
        boolean zEquals = enumC2193ez5.A04(action6).equals(action);
        if (A03[6].charAt(8) != 'X') {
            throw new RuntimeException();
        }
        A03[6] = "gVjZHTAPXXqW3paCpGTUxeCgOEd4dSxo";
        if (zEquals) {
            this.A01.onRewardedVideoClosed();
            return;
        }
        EnumC2193ez enumC2193ez6 = EnumC2193ez.A0B;
        String action7 = this.A02;
        if (enumC2193ez6.A04(action7).equals(action)) {
            NJ nj = this.A01;
            AbstractC2469jh abstractC2469jh = this.A00;
            String[] strArr = A03;
            if (strArr[2].charAt(25) != strArr[4].charAt(25)) {
                throw new RuntimeException();
            }
            A03[6] = "QgP7tKiwXm5h6JnagwUE7gN68w8IQRlz";
            nj.AFj(abstractC2469jh);
            return;
        }
        EnumC2193ez enumC2193ez7 = EnumC2193ez.A0C;
        String action8 = this.A02;
        if (enumC2193ez7.A04(action8).equals(action)) {
            this.A01.AFk(this.A00);
            return;
        }
        EnumC2193ez enumC2193ez8 = EnumC2193ez.A03;
        String str = this.A02;
        if (A03[0].charAt(19) != 'F') {
            A03[1] = "4VvB4uonEo2HdG2J";
            String action9 = enumC2193ez8.A04(str);
            if (!action9.equals(action)) {
                return;
            }
        } else {
            String action10 = enumC2193ez8.A04(str);
            if (!action10.equals(action)) {
                return;
            }
        }
        this.A01.onRewardedVideoActivityDestroyed();
    }
}
