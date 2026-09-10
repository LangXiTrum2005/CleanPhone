package com.gyf.immersionbar;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class GestureUtils {

    public static class GestureBean {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f21431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f21432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public NavigationBarType f21433c;

        public final String toString() {
            return "GestureBean{isGesture=" + this.f21431a + ", checkNavigation=" + this.f21432b + ", type=" + this.f21433c + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
