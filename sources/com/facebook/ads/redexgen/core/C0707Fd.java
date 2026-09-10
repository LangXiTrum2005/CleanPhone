package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0707Fd extends FrameLayout {
    public static String[] A08 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public DQ A00;
    public C0666Do A01;
    public final AbstractC1984md A02;
    public final C1828k1 A03;
    public final DR A04;
    public final InterfaceC0706Fc A05;
    public final C1361cL A06;
    public final List<View> A07;

    public C0707Fd(C0727Fx c0727Fx, AbstractC1984md abstractC1984md, C1361cL c1361cL, DR dr, InterfaceC0706Fc interfaceC0706Fc, View... viewArr) {
        this(c0727Fx.A05(), c0727Fx.A0B(), abstractC1984md, c1361cL, dr, interfaceC0706Fc, viewArr);
    }

    public C0707Fd(C0727Fx c0727Fx, AbstractC1984md abstractC1984md, C1361cL c1361cL, C1283b5 c1283b5, FH fh, DR dr, InterfaceC0706Fc interfaceC0706Fc) {
        this(c0727Fx, abstractC1984md, c1361cL, dr, interfaceC0706Fc, c1283b5, fh);
    }

    public C0707Fd(C1828k1 c1828k1, DQ dq, AbstractC1984md abstractC1984md, C1361cL c1361cL, DR dr, InterfaceC0706Fc interfaceC0706Fc, View... viewArr) {
        super(c1828k1);
        this.A07 = new ArrayList();
        this.A03 = c1828k1;
        this.A00 = dq;
        this.A02 = abstractC1984md;
        for (View view : viewArr) {
            if (view != null) {
                this.A07.add(view);
            }
        }
        this.A04 = dr;
        this.A06 = c1361cL;
        this.A05 = interfaceC0706Fc;
        A04();
    }

    private void A04() {
        String strA06;
        RewardData rewardDataA0c = this.A02.A0c();
        if (rewardDataA0c == null) {
            strA06 = this.A02.A1d().A05();
        } else {
            strA06 = this.A02.A1d().A06(rewardDataA0c.getCurrency(), rewardDataA0c.getQuantity());
        }
        this.A01 = new C0666Do(this.A03, -1, ViewCompat.MEASURED_STATE_MASK, strA06, null, this.A02.A1d().A04(), this.A02.A1d().A03(), DC.A01(DB.REWARD_ICON));
        this.A01.A02.setOnClickListener(new ViewOnClickListenerC0704Fa(this));
        this.A01.A01.setOnClickListener(new ViewOnClickListenerC0705Fb(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A01, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06 != null) {
            this.A06.A0f(II.A07);
        }
        this.A05.ACB();
        if (!this.A02.A1b().A0R()) {
            this.A02.A1j(this.A04);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074 A[LOOP:0: B:15:0x004d->B:20:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0024 A[EDGE_INSN: B:23:0x0024->B:8:0x0024 BREAK  A[LOOP:0: B:15:0x004d->B:20:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0081 A[SYNTHETIC] */
    public final void A07(ViewGroup viewGroup) {
        Iterator<View> it;
        boolean zHasNext;
        String[] strArr;
        if (this.A06 != null && !this.A06.A0q()) {
            C1361cL c1361cL = this.A06;
            String[] strArr2 = A08;
            if (strArr2[0].length() == strArr2[3].length()) {
                String[] strArr3 = A08;
                strArr3[4] = "1Ran1dt8ESvXQPCOL";
                strArr3[1] = BidResponsed.KEY_WN;
                c1361cL.A0l(false, false, 11);
                D3.A0L(this.A06, 4);
                if (this.A00 != null) {
                    D3.A0F(this.A00);
                }
                it = this.A07.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    strArr = A08;
                    if (strArr[5].charAt(31) != strArr[6].charAt(31)) {
                        break;
                        break;
                    }
                    String[] strArr4 = A08;
                    strArr4[0] = "6LHnkwVNW3v3BurcJpp";
                    strArr4[3] = "pBsoAnuzgJgS4JAM4BB";
                    if (zHasNext) {
                        View next = it.next();
                        next.clearAnimation();
                        D3.A0L(next, 4);
                    } else {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        viewGroup.addView(this, layoutParams);
                        this.A05.AE2();
                        return;
                    }
                }
            }
        } else {
            if (this.A00 != null) {
                D3.A0F(this.A00);
            }
            it = this.A07.iterator();
            while (true) {
                zHasNext = it.hasNext();
                strArr = A08;
                if (strArr[5].charAt(31) != strArr[6].charAt(31)) {
                    break;
                }
                String[] strArr5 = A08;
                strArr5[0] = "6LHnkwVNW3v3BurcJpp";
                strArr5[3] = "pBsoAnuzgJgS4JAM4BB";
                if (zHasNext) {
                    View next2 = it.next();
                    next2.clearAnimation();
                    D3.A0L(next2, 4);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    viewGroup.addView(this, layoutParams2);
                    this.A05.AE2();
                    return;
                }
            }
        }
        throw new RuntimeException();
    }
}
