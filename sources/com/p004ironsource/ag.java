package com.p004ironsource;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public interface ag {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<zb> f24340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f24341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f24342c;
        private Exception d;

        public a(ArrayList<zb> arrayList) {
            this.f24341b = false;
            this.f24342c = -1;
            this.f24340a = arrayList;
        }

        public a a(int i2) {
            return new a(this.f24340a, i2, this.f24341b, this.d);
        }

        public ArrayList<zb> b() {
            return this.f24340a;
        }

        public boolean c() {
            return this.f24341b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f24341b + ", responseCode=" + this.f24342c + ", exception=" + this.d + AbstractJsonLexerKt.END_OBJ;
        }

        public a(ArrayList<zb> arrayList, int i2, boolean z2, Exception exc) {
            this.f24340a = arrayList;
            this.f24341b = z2;
            this.d = exc;
            this.f24342c = i2;
        }

        public a a(Exception exc) {
            return new a(this.f24340a, this.f24342c, this.f24341b, exc);
        }

        public a a(boolean z2) {
            return new a(this.f24340a, this.f24342c, z2, this.d);
        }

        public String a() {
            if (this.f24341b) {
                return "";
            }
            return "rc=" + this.f24342c + ", ex=" + this.d;
        }
    }

    void a(a aVar);
}
