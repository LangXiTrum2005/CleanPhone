package k6;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44333c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f44331a = i10;
        this.f44333c = obj;
        this.f44332b = obj2;
    }

    @Override // k6.r
    public final boolean a(Object obj) {
        switch (this.f44331a) {
            case 0:
                Uri uri = (Uri) obj;
                return X3.i.f27782b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.f44333c).iterator();
                while (it.hasNext()) {
                    if (((r) it.next()).a(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f44333c).getPackageName().equals(uri2.getAuthority());
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, k6.a] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, k6.f] */
    @Override // k6.r
    public final q b(Object obj, int i10, int i11, e6.i iVar) {
        q qVarB;
        Uri uri;
        switch (this.f44331a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new q(new z6.d(uri2), this.f44332b.k((AssetManager) this.f44333c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) iVar.c(p6.c.f48259b);
                return new q(new z6.d(num), new e(theme, theme != null ? theme.getResources() : ((Context) this.f44333c).getResources(), this.f44332b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f44333c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                e6.f fVar = null;
                for (int i12 = 0; i12 < size; i12++) {
                    r rVar = (r) arrayList.get(i12);
                    if (rVar.a(obj) && (qVarB = rVar.b(obj, i10, i11, iVar)) != null) {
                        fVar = qVarB.f44369a;
                        arrayList2.add(qVarB.f44371c);
                    }
                }
                if (arrayList2.isEmpty() || fVar == null) {
                    return null;
                }
                return new q(fVar, new v(arrayList2, (l0.b) this.f44332b));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) this.f44332b;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                    break;
                } catch (Resources.NotFoundException e10) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e10);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((r) this.f44333c).b(uri, i10, i11, iVar);
            default:
                Uri uri3 = (Uri) obj;
                r rVar2 = (r) this.f44332b;
                List<String> pathSegments = uri3.getPathSegments();
                q qVarB2 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i13 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i13 != 0) {
                            qVarB2 = rVar2.b(Integer.valueOf(i13), i10, i11, iVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return qVarB2;
                    } catch (NumberFormatException e11) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return qVarB2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e11);
                        return qVarB2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f44333c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return rVar2.b(Integer.valueOf(identifier), i10, i11, iVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.f44331a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f44333c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public b(Resources resources, r rVar) {
        this.f44331a = 3;
        this.f44332b = resources;
        this.f44333c = rVar;
    }

    public b(Context context, f fVar) {
        this.f44331a = 1;
        this.f44333c = context.getApplicationContext();
        this.f44332b = fVar;
    }

    public b(Context context, r rVar) {
        this.f44331a = 4;
        this.f44333c = context.getApplicationContext();
        this.f44332b = rVar;
    }
}
