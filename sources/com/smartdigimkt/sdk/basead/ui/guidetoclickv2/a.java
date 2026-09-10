package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.f5.h;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.w5.c;
import com.smartdigimkt.w5.g;
import com.smartdigimkt.w6.f;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f38527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.v6.a f38528c;
    private RelativeLayout d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38529e;
    private View f;
    Queue<com.smartdigimkt.sdk.basead.ui.guidetoclickv2.b> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.smartdigimkt.sdk.basead.ui.guidetoclickv2.b f38530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c.a f38531i;
    Map<String, Object> j;
    BaseG2CV2View.c k = new C0608a();

    /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a$a, reason: collision with other inner class name */
    public class C0608a implements BaseG2CV2View.c {
        public C0608a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View.c
        public void a() {
            Object obj;
            Map<String, Object> map = a.this.j;
            if (map != null && (obj = map.get(g.a.f39428c)) != null && (obj instanceof h)) {
                ((h) obj).a(2);
            }
            a.this.d();
        }

        @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View.c
        public void b() {
            a.this.g();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f38533a = 180;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f38534b = 50;
    }

    public a(Context context, f fVar, com.smartdigimkt.v6.a aVar, int i2, RelativeLayout relativeLayout, View view, c.a aVar2) {
        this.f38526a = context;
        this.f38527b = fVar;
        this.f38528c = aVar;
        this.f38529e = i2;
        this.d = relativeLayout;
        this.f = view;
        this.f38531i = aVar2;
        a();
    }

    private void e() {
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.b bVar = this.f38530h;
        if (bVar != null) {
            bVar.b();
            this.f38530h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        e();
        if (this.g.size() > 0) {
            this.f38530h = this.g.poll();
            f();
        }
    }

    public void b() {
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.b bVar = this.f38530h;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void c() {
        f();
    }

    public void d() {
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.b bVar = this.f38530h;
        if (bVar != null) {
            bVar.a();
        }
        e();
        Queue<com.smartdigimkt.sdk.basead.ui.guidetoclickv2.b> queue = this.g;
        if (queue != null) {
            queue.clear();
        }
    }

    public void f() {
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.b bVar = this.f38530h;
        if (bVar != null) {
            bVar.c();
        } else {
            g();
        }
    }

    private void a() {
        this.g = new ConcurrentLinkedQueue();
        com.smartdigimkt.w6.g gVar = this.f38528c.t;
        int iD1 = this.f38529e == 3 ? gVar.D1() : com.smartdigimkt.n8.c.K(this.f38526a);
        long jX = gVar.x();
        String strV = gVar.v();
        if (TextUtils.isEmpty(strV)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(strV);
            if (jSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    int iOptInt = jSONObjectOptJSONObject.optInt("cgf_type", -1);
                    if (!a(iOptInt, iD1)) {
                        long jOptLong = jSONObjectOptJSONObject.optLong("cgf_st", -1L);
                        if (iOptInt > 0 && jOptLong >= 0) {
                            this.g.add(new com.smartdigimkt.sdk.basead.ui.guidetoclickv2.b(this.f38526a, this.f38527b, this.f38528c, this.f38529e, new com.smartdigimkt.sdk.basead.ui.guidetoclickv2.b.e(i2 + 1, iOptInt, jX, jOptLong, gVar.w(), iD1), this.d, this.f, this.f38531i, this.k));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x009d A[RETURN] */
    private boolean a(int i2, int i3) {
        int i4;
        switch (i2) {
            case 1:
            case 6:
            case 7:
            case 11:
            case 12:
                if (i2 != 6 || com.smartdigimkt.j5.a.a().d("g2c_finger_icon")) {
                    return false;
                }
                return true;
            case 2:
                if (i.g(this.f38527b, this.f38528c) || !((i4 = this.f38529e) == 1 || i4 == 3)) {
                    return true;
                }
                return false;
            case 3:
                int i5 = this.f38529e;
                if (i5 == 1 || i5 == 3) {
                    return false;
                }
                return true;
            case 4:
            case 5:
                int i6 = this.f38529e;
                return !(i6 == 1 || i6 == 2 || i6 == 3) || this.f == null;
            case 8:
            case 9:
            case 10:
                boolean z2 = (this.f38528c.f39164b == 1 && i3 == 1) ? false : true;
                if (!z2) {
                    if (i2 == 9 && !com.smartdigimkt.j5.a.a().d("g2c_chop")) {
                        z2 = true;
                    }
                    if ((i2 == 8 || i2 == 10) && !com.smartdigimkt.j5.a.a().d("g2c_finger_icon_v2")) {
                        z2 = true;
                    }
                    if (i2 == 10 && !com.smartdigimkt.j5.a.a().d("g2c_lucky_bag")) {
                        z2 = true;
                    }
                    if (i2 == 8 && !com.smartdigimkt.j5.a.a().d("g2c_lucky_bag_v2")) {
                        return true;
                    }
                }
                return z2;
            case 13:
                int i7 = this.f38528c.f39164b;
                if ((i7 == 4 || i7 == 3) && i3 == 1) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    public void a(Map<String, Object> map) {
        this.j = map;
    }
}
