package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class la1 extends mb1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Iterator f16845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16846f;

    public la1() {
        super(0);
        this.f16843c = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        h81 h81Var;
        Object next;
        Set set;
        ps1.c0(this.f16843c != 4);
        int i10 = this.f16843c;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f16843c = 4;
            switch (this.f16844d) {
                case 0:
                    do {
                        Iterator it = this.f16845e;
                        if (!it.hasNext()) {
                            this.f16843c = 3;
                            next = null;
                        } else {
                            h81Var = (h81) this.f16846f;
                            next = it.next();
                        }
                        break;
                    } while (!h81Var.zza(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.f16845e;
                        if (!it2.hasNext()) {
                            this.f16843c = 3;
                            next = null;
                        } else {
                            set = (Set) this.f16846f;
                            next = it2.next();
                        }
                        break;
                    } while (!set.contains(next));
                    break;
            }
            this.f16842b = next;
            if (this.f16843c != 3) {
                this.f16843c = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mb1, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16843c = 2;
        Object obj = this.f16842b;
        this.f16842b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public la1(gb1 gb1Var, Set set, Set set2) {
        this();
        this.f16844d = 1;
        this.f16846f = set2;
        this.f16845e = set.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public la1(Iterator it, h81 h81Var) {
        this();
        this.f16844d = 0;
        this.f16845e = it;
        this.f16846f = h81Var;
    }
}
