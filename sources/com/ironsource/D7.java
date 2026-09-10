package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface D7 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<C0654x5> f25947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Exception f25950d;

        public a(ArrayList<C0654x5> arrayList) {
            this.f25948b = false;
            this.f25949c = -1;
            this.f25947a = arrayList;
        }

        public a a(Exception exc) {
            return new a(this.f25947a, this.f25949c, this.f25948b, exc);
        }

        public ArrayList<C0654x5> b() {
            return this.f25947a;
        }

        public boolean c() {
            return this.f25948b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f25948b + ", responseCode=" + this.f25949c + ", exception=" + this.f25950d + '}';
        }

        public a a(boolean z10) {
            return new a(this.f25947a, this.f25949c, z10, this.f25950d);
        }

        public a a(int i10) {
            return new a(this.f25947a, i10, this.f25948b, this.f25950d);
        }

        public String a() {
            if (this.f25948b) {
                return "";
            }
            return "rc=" + this.f25949c + ", ex=" + this.f25950d;
        }

        public a(ArrayList<C0654x5> arrayList, int i10, boolean z10, Exception exc) {
            this.f25947a = arrayList;
            this.f25948b = z10;
            this.f25950d = exc;
            this.f25949c = i10;
        }
    }

    void a(a aVar);
}
