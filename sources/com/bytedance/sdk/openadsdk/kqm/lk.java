package com.bytedance.sdk.openadsdk.kqm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.JXs.JVA;
import com.bytedance.sdk.component.JXs.OY;
import com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb.QAg;
import com.bytedance.sdk.component.LD.Lxb.ZU;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.IeN;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class lk {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile lk Lxb;
    private final com.bytedance.sdk.component.ebl.Lxb LD;
    private com.bytedance.sdk.openadsdk.kqm.Lxb.lk lk;

    private lk(Context context) {
        com.bytedance.sdk.component.ebl.Lxb.C0062Lxb c0062Lxb = new com.bytedance.sdk.component.ebl.Lxb.C0062Lxb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.ebl.Lxb Lxb2 = c0062Lxb.Lxb(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).LD(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).lk(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).Lxb(true).Lxb();
        this.LD = Lxb2;
        com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb.Lxb.Lxb(new QAg() { // from class: com.bytedance.sdk.openadsdk.kqm.lk.1
            @Override // com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb.QAg
            public boolean LD() {
                return VVE.TA().mb();
            }

            @Override // com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb.QAg
            public ExecutorService Lxb() {
                if (VVE.TA().mb()) {
                    return hg.nBu();
                }
                return null;
            }
        });
        ZU zuLxb = Lxb2.JXs().Lxb();
        if (zuLxb != null) {
            zuLxb.Lxb(32);
        }
    }

    public static lk Lxb() {
        if (Lxb == null) {
            synchronized (lk.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new lk(kqm.Lxb());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    private void ZU() {
        if (this.lk == null) {
            this.lk = new com.bytedance.sdk.openadsdk.kqm.Lxb.lk();
        }
    }

    public com.bytedance.sdk.component.ebl.Lxb LD() {
        return this.LD;
    }

    public com.bytedance.sdk.openadsdk.kqm.Lxb.lk lk() {
        ZU();
        return this.lk;
    }

    public void Lxb(String str, int i, int i2, ImageView imageView, tD tDVar) {
        com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(str).Lxb(i).LD(i2).JXs(le.ZU(kqm.Lxb())).ZU(le.lk(kqm.Lxb())).lk(2).Lxb(com.bytedance.sdk.openadsdk.QAg.lk.Lxb(tDVar, str, imageView));
    }

    public void Lxb(int i, final ImageView imageView, final tD tDVar) {
        com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(tDVar.lc()).Lxb(i).LD(i).JXs(le.ZU(kqm.Lxb())).ZU(le.lk(kqm.Lxb())).lk(2).Lxb(com.bytedance.sdk.openadsdk.QAg.lk.Lxb(tDVar, tDVar.lc(), imageView));
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.kqm.lk.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (imageView.getDrawable() != null) {
                        Intent intent = new Intent();
                        String strEbl = tDVar.ebl();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(strEbl));
                        try {
                            com.bytedance.sdk.component.utils.LD.Lxb(kqm.Lxb(), intent, null);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void Lxb(IeN ieN, ImageView imageView, tD tDVar) {
        if (ieN == null || TextUtils.isEmpty(ieN.Lxb()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(ieN).lk(2).Lxb(com.bytedance.sdk.openadsdk.QAg.lk.Lxb(tDVar, ieN.Lxb(), imageView));
    }

    public void Lxb(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(str).lk(2).Lxb(new OY() { // from class: com.bytedance.sdk.openadsdk.kqm.lk.4
            @Override // com.bytedance.sdk.component.JXs.OY
            public Bitmap Lxb(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.ZU.Lxb.Lxb(view2.getContext(), bitmap, 10);
            }
        }).Lxb(new com.bytedance.sdk.component.JXs.VVE<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.kqm.lk.3
            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(int i, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(JVA<Bitmap> jva) {
                final View view2;
                if (jva == null) {
                    return;
                }
                final Bitmap bitmapLD = jva.LD();
                if (!(bitmapLD instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (!hg.JXs()) {
                    view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kqm.lk.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            View view3 = view2;
                            if (view3 instanceof ImageView) {
                                ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) bitmapLD));
                            } else {
                                view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) bitmapLD));
                            }
                        }
                    });
                } else if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), bitmapLD));
                } else {
                    view2.setBackground(new BitmapDrawable(view2.getResources(), bitmapLD));
                }
            }
        });
    }
}
