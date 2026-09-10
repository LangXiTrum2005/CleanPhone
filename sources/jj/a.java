package jj;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import b2.p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ea.b0;
import eb.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k9.c0;
import k9.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements OnCompleteListener, xi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f43928b;

    public /* synthetic */ a(b bVar, int i10) {
        this.f43927a = i10;
        this.f43928b = bVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i10 = this.f43927a;
        b bVar = this.f43928b;
        switch (i10) {
            case 0:
                bVar.getClass();
                if (!task.isSuccessful()) {
                    bVar.b("status", "Failed to signout.");
                } else {
                    m mVar = (m) bVar.f43933e.f23262c;
                    Objects.requireNonNull(mVar);
                    mVar.c();
                    bVar.f43933e = null;
                }
                break;
            case 1:
                bVar.getClass();
                if (!task.isSuccessful()) {
                    bVar.b("status", "Failed to disconnect.");
                } else {
                    m mVar2 = (m) bVar.f43933e.f23262c;
                    Objects.requireNonNull(mVar2);
                    mVar2.c();
                    bVar.f43933e = null;
                }
                break;
            default:
                bVar.g(task);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x027b  */
    @Override // xi.b
    public void t(Object obj, wi.b bVar) {
        GoogleSignInOptions googleSignInOptions;
        GoogleSignInAccount googleSignInAccount;
        f9.c cVar;
        com.google.android.gms.common.api.internal.j jVar;
        GoogleSignInAccount googleSignInAccount2;
        GoogleSignInAccount googleSignInAccount3;
        switch (this.f43927a) {
            case 3:
                b bVar2 = this.f43928b;
                ArrayList arrayList = new ArrayList();
                try {
                    bVar2.d((h) ((ArrayList) obj).get(0));
                    arrayList.add(0, null);
                    break;
                } catch (Throwable th2) {
                    arrayList = d0.c.U(th2);
                }
                bVar.e(arrayList);
                return;
            case 4:
                b bVar3 = this.f43928b;
                bVar3.a("signInSilently", new f(new ArrayList(), bVar, 0), null, null, null, null);
                f9.a aVar = bVar3.f43931c;
                v vVar = aVar.f43748i;
                Context context = aVar.f43740a;
                GoogleSignInOptions googleSignInOptions2 = (GoogleSignInOptions) aVar.f43744e;
                boolean z10 = aVar.g() == 3;
                p pVar = g9.j.f41766a;
                pVar.d("silentSignIn()", new Object[0]);
                pVar.d("getEligibleSavedSignInResult()", new Object[0]);
                c0.h(googleSignInOptions2);
                g9.k kVarJ = g9.k.J(context);
                synchronized (kVarJ) {
                    googleSignInOptions = (GoogleSignInOptions) kVarJ.f41772d;
                }
                if (googleSignInOptions == null) {
                    cVar = null;
                } else {
                    Account account = googleSignInOptions.f11621c;
                    Account account2 = googleSignInOptions2.f11621c;
                    if (account != null ? !account.equals(account2) : account2 != null) {
                        cVar = null;
                    } else if (!googleSignInOptions2.f11623e && ((!googleSignInOptions2.f11622d || (googleSignInOptions.f11622d && c0.l(googleSignInOptions2.f11625g, googleSignInOptions.f11625g))) && new HashSet(new ArrayList(googleSignInOptions.f11620b)).containsAll(new HashSet(new ArrayList(googleSignInOptions2.f11620b))))) {
                        g9.k kVarJ2 = g9.k.J(context);
                        synchronized (kVarJ2) {
                            googleSignInAccount = (GoogleSignInAccount) kVarJ2.f41771c;
                        }
                        if (googleSignInAccount == null || System.currentTimeMillis() / 1000 >= googleSignInAccount.f11608g - 300) {
                            cVar = null;
                        } else {
                            cVar = new f9.c(googleSignInAccount, Status.f11649e);
                        }
                    } else {
                        cVar = null;
                    }
                }
                if (cVar != null) {
                    pVar.d("Eligible saved sign in result found", new Object[0]);
                    com.google.android.gms.common.api.internal.l lVar = new com.google.android.gms.common.api.internal.l(vVar, 1);
                    lVar.J(cVar);
                    jVar = new com.google.android.gms.common.api.internal.j(lVar);
                } else if (z10) {
                    f9.c cVar2 = new f9.c(null, new Status(4, null, null, null));
                    com.google.android.gms.common.api.internal.l lVar2 = new com.google.android.gms.common.api.internal.l(vVar, 1);
                    lVar2.J(cVar2);
                    jVar = new com.google.android.gms.common.api.internal.j(lVar2);
                } else {
                    pVar.d("trySilentSignIn()", new Object[0]);
                    g9.g gVar = new g9.g(vVar, context, googleSignInOptions2);
                    vVar.f11773b.b(0, gVar);
                    jVar = new com.google.android.gms.common.api.internal.j(gVar);
                }
                b0 b0Var = f9.a.l;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                jVar.f11722e.F(new u(jVar, taskCompletionSource, b0Var));
                Task task = taskCompletionSource.getTask();
                if (task.isComplete()) {
                    bVar3.g(task);
                    return;
                } else {
                    task.addOnCompleteListener(new a(bVar3, 2));
                    return;
                }
            case 5:
                b bVar4 = this.f43928b;
                g gVar2 = new g(new ArrayList(), bVar, 0);
                if (bVar4.f43930b == null) {
                    throw new IllegalStateException("signIn needs a foreground activity");
                }
                bVar4.a("signIn", gVar2, null, null, null, null);
                bVar4.f43930b.startActivityForResult(bVar4.f43931c.d(), 53293);
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) obj;
                this.f43928b.c((String) arrayList2.get(0), (Boolean) arrayList2.get(1), new f(new ArrayList(), bVar, 1));
                return;
            case 7:
                b bVar5 = this.f43928b;
                bVar5.a("signOut", null, new g(new ArrayList(), bVar, 1), null, null, null);
                bVar5.f43931c.f().addOnCompleteListener(new a(bVar5, 0));
                return;
            case 8:
                b bVar6 = this.f43928b;
                bVar6.a("disconnect", null, new f(new ArrayList(), bVar, 2), null, null, null);
                bVar6.f43931c.e().addOnCompleteListener(new a(bVar6, 1));
                return;
            case 9:
                b bVar7 = this.f43928b;
                ArrayList arrayList3 = new ArrayList();
                try {
                    g9.k kVarJ3 = g9.k.J(bVar7.f43929a);
                    synchronized (kVarJ3) {
                        googleSignInAccount2 = (GoogleSignInAccount) kVarJ3.f41771c;
                    }
                    arrayList3.add(0, Boolean.valueOf(googleSignInAccount2 != null));
                } catch (Throwable th3) {
                    arrayList3 = d0.c.U(th3);
                }
                bVar.e(arrayList3);
                return;
            case 10:
                b bVar8 = this.f43928b;
                ArrayList arrayList4 = new ArrayList();
                String str = (String) ((ArrayList) obj).get(0);
                try {
                    bVar8.getClass();
                    try {
                        d9.a.a(bVar8.f43929a, str);
                        arrayList4.add(0, null);
                    } catch (Exception e10) {
                        throw new e("exception", e10.getMessage());
                    }
                } catch (Throwable th4) {
                    arrayList4 = d0.c.U(th4);
                }
                bVar.e(arrayList4);
                return;
            default:
                b bVar9 = this.f43928b;
                ArrayList arrayList5 = new ArrayList();
                List list = (List) ((ArrayList) obj).get(0);
                bVar9.a("requestScopes", null, null, new g(arrayList5, bVar, 2), null, null);
                g9.k kVarJ4 = g9.k.J(bVar9.f43929a);
                synchronized (kVarJ4) {
                    googleSignInAccount3 = (GoogleSignInAccount) kVarJ4.f41771c;
                }
                if (googleSignInAccount3 == null) {
                    bVar9.b("sign_in_required", "No account to grant scopes.");
                    return;
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Scope scope = new Scope(1, (String) it.next());
                    HashSet hashSet = new HashSet();
                    Collections.addAll(hashSet, scope);
                    if (!new HashSet(googleSignInAccount3.f11610i).containsAll(hashSet)) {
                        arrayList6.add(scope);
                    }
                }
                Account account3 = null;
                if (arrayList6.isEmpty()) {
                    Boolean bool = Boolean.TRUE;
                    j jVar2 = (j) bVar9.f43933e.f23263d;
                    Objects.requireNonNull(jVar2);
                    jVar2.a(bool);
                    bVar9.f43933e = null;
                    return;
                }
                Activity activity = bVar9.f43930b;
                Scope[] scopeArr = (Scope[]) arrayList6.toArray(new Scope[0]);
                c0.i(activity, "Please provide a non-null Activity");
                c0.i(scopeArr, "Please provide at least one scope");
                HashSet hashSet2 = new HashSet();
                HashMap map = new HashMap();
                if (scopeArr.length > 0) {
                    hashSet2.add(scopeArr[0]);
                    hashSet2.addAll(Arrays.asList(scopeArr));
                }
                String str2 = googleSignInAccount3.f11604c;
                if (!TextUtils.isEmpty(str2)) {
                    c0.h(str2);
                    c0.e(str2);
                    account3 = new Account(str2, "com.google");
                }
                Account account4 = account3;
                if (hashSet2.contains(GoogleSignInOptions.f11617p)) {
                    Scope scope2 = GoogleSignInOptions.f11616o;
                    if (hashSet2.contains(scope2)) {
                        hashSet2.remove(scope2);
                    }
                }
                GoogleSignInOptions googleSignInOptions3 = new GoogleSignInOptions(3, new ArrayList(hashSet2), account4, false, false, false, null, null, map, null);
                d0 d0Var = e9.a.f39182a;
                fd.b bVar10 = new fd.b(8);
                Looper mainLooper = activity.getMainLooper();
                c0.i(mainLooper, "Looper must not be null.");
                activity.startActivityForResult(new f9.a(activity, activity, d0Var, googleSignInOptions3, new j9.h(bVar10, mainLooper)).d(), 53295);
                return;
        }
    }
}
