package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nr1 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f17929h = new b(18);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mr1 f17931b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public lr1 f17935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public lr1 f17936g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17932c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17933d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f17930a = f17929h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mr1 f17934e = new mr1();

    public final mr1 a(Object obj, boolean z10) {
        int iCompareTo;
        mr1 mr1Var;
        mr1 mr1Var2 = this.f17931b;
        b bVar = f17929h;
        b bVar2 = this.f17930a;
        if (mr1Var2 != null) {
            Comparable comparable = bVar2 == bVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mr1Var2.f17532f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : bVar2.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return mr1Var2;
                }
                mr1 mr1Var3 = iCompareTo < 0 ? mr1Var2.f17528b : mr1Var2.f17529c;
                if (mr1Var3 == null) {
                    break;
                }
                mr1Var2 = mr1Var3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        mr1 mr1Var4 = this.f17934e;
        if (mr1Var2 != null) {
            mr1 mr1Var5 = new mr1(mr1Var2, obj, mr1Var4, mr1Var4.f17531e);
            if (iCompareTo < 0) {
                mr1Var2.f17528b = mr1Var5;
            } else {
                mr1Var2.f17529c = mr1Var5;
            }
            d(mr1Var2, true);
            mr1Var = mr1Var5;
        } else {
            if (bVar2 == bVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mr1Var = new mr1(null, obj, mr1Var4, mr1Var4.f17531e);
            this.f17931b = mr1Var;
        }
        this.f17932c++;
        this.f17933d++;
        return mr1Var;
    }

    public final void b(mr1 mr1Var, boolean z10) {
        mr1 mr1Var2;
        mr1 mr1Var3;
        int i10;
        if (z10) {
            mr1 mr1Var4 = mr1Var.f17531e;
            mr1Var4.f17530d = mr1Var.f17530d;
            mr1Var.f17530d.f17531e = mr1Var4;
        }
        mr1 mr1Var5 = mr1Var.f17528b;
        mr1 mr1Var6 = mr1Var.f17529c;
        mr1 mr1Var7 = mr1Var.f17527a;
        int i11 = 0;
        if (mr1Var5 == null || mr1Var6 == null) {
            if (mr1Var5 != null) {
                c(mr1Var, mr1Var5);
                mr1Var.f17528b = null;
            } else if (mr1Var6 != null) {
                c(mr1Var, mr1Var6);
                mr1Var.f17529c = null;
            } else {
                c(mr1Var, null);
            }
            d(mr1Var7, false);
            this.f17932c--;
            this.f17933d++;
            return;
        }
        if (mr1Var5.f17534h > mr1Var6.f17534h) {
            do {
                mr1Var3 = mr1Var5;
                mr1Var5 = mr1Var5.f17529c;
            } while (mr1Var5 != null);
        } else {
            do {
                mr1Var2 = mr1Var6;
                mr1Var6 = mr1Var6.f17528b;
            } while (mr1Var6 != null);
            mr1Var3 = mr1Var2;
        }
        b(mr1Var3, false);
        mr1 mr1Var8 = mr1Var.f17528b;
        if (mr1Var8 != null) {
            i10 = mr1Var8.f17534h;
            mr1Var3.f17528b = mr1Var8;
            mr1Var8.f17527a = mr1Var3;
            mr1Var.f17528b = null;
        } else {
            i10 = 0;
        }
        mr1 mr1Var9 = mr1Var.f17529c;
        if (mr1Var9 != null) {
            i11 = mr1Var9.f17534h;
            mr1Var3.f17529c = mr1Var9;
            mr1Var9.f17527a = mr1Var3;
            mr1Var.f17529c = null;
        }
        mr1Var3.f17534h = Math.max(i10, i11) + 1;
        c(mr1Var, mr1Var3);
    }

    public final void c(mr1 mr1Var, mr1 mr1Var2) {
        mr1 mr1Var3 = mr1Var.f17527a;
        mr1Var.f17527a = null;
        if (mr1Var2 != null) {
            mr1Var2.f17527a = mr1Var3;
        }
        if (mr1Var3 == null) {
            this.f17931b = mr1Var2;
        } else if (mr1Var3.f17528b == mr1Var) {
            mr1Var3.f17528b = mr1Var2;
        } else {
            mr1Var3.f17529c = mr1Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f17931b = null;
        this.f17932c = 0;
        this.f17933d++;
        mr1 mr1Var = this.f17934e;
        mr1Var.f17531e = mr1Var;
        mr1Var.f17530d = mr1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        mr1 mr1VarA = null;
        if (obj != null) {
            try {
                mr1VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return mr1VarA != null;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0080 A[SYNTHETIC] */
    public final void d(mr1 mr1Var, boolean z10) {
        while (mr1Var != null) {
            mr1 mr1Var2 = mr1Var.f17528b;
            mr1 mr1Var3 = mr1Var.f17529c;
            boolean z11 = false;
            int i10 = mr1Var2 != null ? mr1Var2.f17534h : 0;
            int i11 = mr1Var3 != null ? mr1Var3.f17534h : 0;
            int i12 = i10 - i11;
            boolean z12 = true;
            if (i12 == -2) {
                mr1 mr1Var4 = mr1Var3.f17528b;
                mr1 mr1Var5 = mr1Var3.f17529c;
                int i13 = (mr1Var4 != null ? mr1Var4.f17534h : 0) - (mr1Var5 != null ? mr1Var5.f17534h : 0);
                if (i13 != -1) {
                    if (i13 == 0) {
                        if (!z10) {
                        }
                        if (z12) {
                            return;
                        }
                    } else {
                        z12 = z10;
                    }
                    f(mr1Var3);
                    e(mr1Var);
                    if (z12) {
                        return;
                    }
                } else {
                    z11 = z10;
                }
                e(mr1Var);
                z12 = z11;
                if (z12) {
                    return;
                }
            } else if (i12 == 2) {
                mr1 mr1Var6 = mr1Var2.f17528b;
                mr1 mr1Var7 = mr1Var2.f17529c;
                int i14 = (mr1Var6 != null ? mr1Var6.f17534h : 0) - (mr1Var7 != null ? mr1Var7.f17534h : 0);
                if (i14 != 1) {
                    if (i14 == 0) {
                        if (!z10) {
                        }
                        if (z12) {
                            return;
                        }
                    } else {
                        z12 = z10;
                    }
                    e(mr1Var2);
                    f(mr1Var);
                    if (z12) {
                        return;
                    }
                } else {
                    z11 = z10;
                }
                f(mr1Var);
                z12 = z11;
                if (z12) {
                    return;
                }
            } else if (i12 == 0) {
                mr1Var.f17534h = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                mr1Var.f17534h = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            mr1Var = mr1Var.f17527a;
        }
    }

    public final void e(mr1 mr1Var) {
        mr1 mr1Var2 = mr1Var.f17528b;
        mr1 mr1Var3 = mr1Var.f17529c;
        mr1 mr1Var4 = mr1Var3.f17528b;
        mr1 mr1Var5 = mr1Var3.f17529c;
        mr1Var.f17529c = mr1Var4;
        if (mr1Var4 != null) {
            mr1Var4.f17527a = mr1Var;
        }
        c(mr1Var, mr1Var3);
        mr1Var3.f17528b = mr1Var;
        mr1Var.f17527a = mr1Var3;
        int iMax = Math.max(mr1Var2 != null ? mr1Var2.f17534h : 0, mr1Var4 != null ? mr1Var4.f17534h : 0) + 1;
        mr1Var.f17534h = iMax;
        mr1Var3.f17534h = Math.max(iMax, mr1Var5 != null ? mr1Var5.f17534h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        lr1 lr1Var = this.f17935f;
        if (lr1Var != null) {
            return lr1Var;
        }
        lr1 lr1Var2 = new lr1(this, 0);
        this.f17935f = lr1Var2;
        return lr1Var2;
    }

    public final void f(mr1 mr1Var) {
        mr1 mr1Var2 = mr1Var.f17528b;
        mr1 mr1Var3 = mr1Var.f17529c;
        mr1 mr1Var4 = mr1Var2.f17528b;
        mr1 mr1Var5 = mr1Var2.f17529c;
        mr1Var.f17528b = mr1Var5;
        if (mr1Var5 != null) {
            mr1Var5.f17527a = mr1Var;
        }
        c(mr1Var, mr1Var2);
        mr1Var2.f17529c = mr1Var;
        mr1Var.f17527a = mr1Var2;
        int iMax = Math.max(mr1Var3 != null ? mr1Var3.f17534h : 0, mr1Var5 != null ? mr1Var5.f17534h : 0) + 1;
        mr1Var.f17534h = iMax;
        mr1Var2.f17534h = Math.max(iMax, mr1Var4 != null ? mr1Var4.f17534h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        mr1 mr1VarA;
        if (obj != null) {
            try {
                mr1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                mr1VarA = null;
            }
        } else {
            mr1VarA = null;
        }
        if (mr1VarA != null) {
            return mr1VarA.f17533g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        lr1 lr1Var = this.f17936g;
        if (lr1Var != null) {
            return lr1Var;
        }
        lr1 lr1Var2 = new lr1(this, 1);
        this.f17936g = lr1Var2;
        return lr1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null) {
            throw new NullPointerException("value == null");
        }
        mr1 mr1VarA = a(obj, true);
        Object obj3 = mr1VarA.f17533g;
        mr1VarA.f17533g = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        mr1 mr1VarA;
        if (obj != null) {
            try {
                mr1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                mr1VarA = null;
            }
        } else {
            mr1VarA = null;
        }
        if (mr1VarA != null) {
            b(mr1VarA, true);
        }
        if (mr1VarA != null) {
            return mr1VarA.f17533g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f17932c;
    }
}
