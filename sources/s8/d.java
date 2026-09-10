package s8;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m0.s1;
import qd.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f50216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f50217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f50218c;

    public d(Context context, i iVar) {
        s1 s1Var = new s1(context, 22);
        this.f50218c = new HashMap();
        this.f50216a = s1Var;
        this.f50217b = iVar;
    }

    public final synchronized e a(String str) {
        if (this.f50218c.containsKey(str)) {
            return (e) this.f50218c.get(str);
        }
        CctBackendFactory cctBackendFactoryJ = this.f50216a.j(str);
        if (cctBackendFactoryJ == null) {
            return null;
        }
        i iVar = this.f50217b;
        e eVarCreate = cctBackendFactoryJ.create(new b((Context) iVar.f48980b, (a9.a) iVar.f48981c, (a9.a) iVar.f48982d, str));
        this.f50218c.put(str, eVarCreate);
        return eVarCreate;
    }
}
