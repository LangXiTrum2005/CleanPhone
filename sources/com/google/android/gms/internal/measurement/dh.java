package com.google.android.gms.internal.measurement;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dh extends mh {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f23395f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh(String str, Class cls, boolean z10, boolean z11, int i10) {
        super(str, cls, z10, z11);
        this.f23395f = i10;
    }

    @Override // com.google.android.gms.internal.measurement.mh
    public void a(Iterator it, yh yhVar) {
        switch (this.f23395f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.f23753a;
                    if (!zHasNext) {
                        yhVar.a(next, str);
                    } else {
                        StringBuilder sb2 = new StringBuilder(X3.j.f27834d);
                        sb2.append(next);
                        do {
                            sb2.append(',');
                            sb2.append(it.next());
                        } while (it.hasNext());
                        sb2.append(']');
                        yhVar.a(sb2.toString(), str);
                    }
                }
                break;
            default:
                super.a(it, yhVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.mh
    public void b(Object obj, yh yhVar) {
        switch (this.f23395f) {
            case 1:
                w wVar = (w) obj;
                if (wVar == null) {
                    return;
                }
                u uVar = wVar.f24104a.f24055c;
                uVar.getClass();
                int i10 = 0;
                while (true) {
                    if (!(i10 < uVar.h() - uVar.b())) {
                        return;
                    }
                    if (i10 >= uVar.h() - uVar.b()) {
                        throw new NoSuchElementException();
                    }
                    v vVar = uVar.f24003b;
                    int iB = uVar.b() + i10;
                    i10++;
                    Map.Entry entry = (Map.Entry) vVar.f24053a[iB];
                    if (((Set) entry.getValue()).isEmpty()) {
                        yhVar.a(null, (String) entry.getKey());
                    } else {
                        Iterator it = ((Set) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            yhVar.a(it.next(), (String) entry.getKey());
                        }
                    }
                }
                break;
            default:
                super.b(obj, yhVar);
                return;
        }
    }
}
