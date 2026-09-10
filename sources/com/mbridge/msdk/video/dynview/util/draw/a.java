package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.c;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f37440d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f37441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f37442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f37443c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0200a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f37444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f37446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f37447d;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0201a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.video.dynview.shape.a.b f37449a;

            public RunnableC0201a(com.mbridge.msdk.video.dynview.shape.a.b bVar) {
                this.f37449a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f37441a == null || this.f37449a.build() == null) {
                    return;
                }
                a.this.f37441a.setBackground(this.f37449a.build());
            }
        }

        public RunnableC0200a(Bitmap bitmap, int i10, float f10, float f11) {
            this.f37444a = bitmap;
            this.f37445b = i10;
            this.f37446c = f10;
            this.f37447d = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapA = a0.a(this.f37444a, 10);
                Bitmap bitmapA2 = a0.a(this.f37444a, 10);
                com.mbridge.msdk.video.dynview.shape.a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
                bVarA.orientation(this.f37445b).b(bitmapA).a(bitmapA2);
                if (this.f37445b == 2) {
                    float f10 = this.f37446c;
                    float f11 = this.f37447d;
                    if (f10 > f11) {
                        bVarA.b(f10).a(this.f37447d);
                    } else {
                        bVarA.b(f11).a(this.f37446c);
                    }
                } else {
                    bVarA.b(this.f37446c).a(this.f37447d);
                }
                if (a.this.f37441a != null) {
                    a.this.f37441a.post(new RunnableC0201a(bVarA));
                }
            } catch (Exception e10) {
                q0.b("ChoiceOneDrawBitBg", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public void b() {
        if (this.f37441a != null) {
            this.f37441a = null;
        }
        Bitmap bitmap = this.f37442b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f37442b.recycle();
            this.f37442b = null;
        }
        Bitmap bitmap2 = this.f37443c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f37443c.recycle();
        this.f37443c = null;
    }

    public static a a() {
        a aVar;
        if (f37440d != null) {
            return f37440d;
        }
        synchronized (a.class) {
            try {
                if (f37440d == null) {
                    f37440d = new a();
                }
                aVar = f37440d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.f37441a = view;
        int iH = cVar.h();
        float fM = cVar.m();
        float fK = cVar.k();
        try {
            List<CampaignEx> listB = cVar.b();
            String md5 = listB.get(0) != null ? SameMD5.getMD5(listB.get(0).getImageUrl()) : "";
            String md6 = listB.get(1) != null ? SameMD5.getMD5(listB.get(1).getImageUrl()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            if (!TextUtils.isEmpty(md6) && map.containsKey(md6)) {
                bitmap = map.get(md6);
            }
            Bitmap bitmap3 = bitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            a(iH, fM, fK, bitmap2, bitmap3);
        } catch (Exception e10) {
            q0.b("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    private synchronized void a(int i10, float f10, float f11, Bitmap bitmap, Bitmap bitmap2) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0200a(bitmap, i10, f10, f11));
        } catch (Exception e10) {
            q0.a("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }
}
