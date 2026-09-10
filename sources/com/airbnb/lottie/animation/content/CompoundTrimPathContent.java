package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CompoundTrimPathContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9571a = new ArrayList();

    public final void a(Path path) {
        ArrayList arrayList = this.f9571a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            TrimPathContent trimPathContent = (TrimPathContent) arrayList.get(size);
            ThreadLocal threadLocal = Utils.f9946a;
            if (trimPathContent != null && !trimPathContent.f9639a) {
                Utils.a(path, trimPathContent.d.l() / 100.0f, trimPathContent.f9642e.l() / 100.0f, trimPathContent.f.l() / 360.0f);
            }
        }
    }
}
