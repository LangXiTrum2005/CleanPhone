package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.media3.extractor.text.ttml.a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class ShapeData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f9794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9795c;

    public ShapeData(PointF pointF, boolean z2, List list) {
        this.f9794b = pointF;
        this.f9795c = z2;
        this.f9793a = new ArrayList(list);
    }

    public final void a(float f, float f2) {
        if (this.f9794b == null) {
            this.f9794b = new PointF();
        }
        this.f9794b.set(f, f2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f9793a.size());
        sb.append("closed=");
        return a.r(sb, this.f9795c, AbstractJsonLexerKt.END_OBJ);
    }

    public ShapeData() {
        this.f9793a = new ArrayList();
    }
}
