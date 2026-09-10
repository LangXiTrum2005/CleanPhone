package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.e2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class k extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e2 f7512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7513b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a();

        void b();
    }

    public k(e2 e2Var, Context context) {
        super(context);
        this.f7512a = e2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f7513b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f7512a.b();
    }

    public void a(a aVar) {
        if (this.f7513b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f7512a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f7513b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
