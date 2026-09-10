package androidx.room;

import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.datastore.core.CorruptionException;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.charging.screenshow.battery.animations.themes.activity.BatteryHealthAct;
import com.charging.screenshow.battery.animations.themes.activity.ChargingCategoryDetailAct;
import com.charging.screenshow.battery.animations.themes.activity.ImageCategoryDetailAct;
import com.charging.screenshow.battery.animations.themes.activity.ResultAct;
import com.charging.screenshow.battery.animations.themes.activity.z;
import com.charging.screenshow.battery.animations.themes.entity.ImageCategoryBean;
import com.charging.screenshow.battery.animations.themes.network.base.resource.Resource;
import com.charging.screenshow.battery.animations.themes.network.entity.ImageCategory;
import com.charging.screenshow.battery.animations.themes.network.entity.ImageCategoryResponse;
import com.charging.screenshow.battery.animations.themes.network.entity.ImageResponse;
import com.charging.screenshow.battery.animations.themes.view.dialog.ChargingGuideDialog;
import com.charging.screenshow.battery.animations.themes.view.dialog.DownloadDialog;
import com.charging.screenshow.battery.animations.themes.vm.CategoryDetailVM;
import com.charging.screenshow.battery.animations.themes.vm.ImageCategoryVM;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDataSerializer;
import com.google.firebase.sessions.Time;
import com.p004ironsource.dc;
import com.p004ironsource.sdk.controller.v;
import com.p004ironsource.vh;
import com.startapp.sdk.internal.ha;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.modules.SerializersModuleCollector;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f8276Y;

    public /* synthetic */ b(RoomRawQuery roomRawQuery, LimitOffsetPagingSource limitOffsetPagingSource, int i2) {
        this.X = 2;
        this.f8276Y = roomRawQuery;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        ImageResponse imageResponse;
        String strA;
        Object objA;
        Throwable th;
        boolean z2 = false;
        int i2 = 1;
        Unit unit = Unit.f43263a;
        Object obj = this.f8276Y;
        switch (this.X) {
            case 0:
                SupportSQLiteDatabase db = (SupportSQLiteDatabase) it;
                Intrinsics.f(db, "db");
                ((RoomConnectionManager) obj).d = db;
                return unit;
            case 1:
                DatabaseConfiguration config = (DatabaseConfiguration) it;
                Intrinsics.f(config, "config");
                return ((RoomDatabase) obj).e(config);
            case 2:
                SQLiteConnection connection = (SQLiteConnection) it;
                Intrinsics.f(connection, "connection");
                ((RoomRawQuery) obj).getClass();
                connection.R0(null);
                throw null;
            case 3:
                int i3 = BatteryHealthAct.i0;
                Intrinsics.f((View) it, "it");
                ((BatteryHealthAct) obj).onBackPressed();
                return unit;
            case 4:
                int i4 = ChargingCategoryDetailAct.k0;
                Intrinsics.f((View) it, "it");
                ((ChargingCategoryDetailAct) obj).onBackPressed();
                return unit;
            case 5:
                int i5 = ImageCategoryDetailAct.k0;
                Intrinsics.f((View) it, "it");
                ((ImageCategoryDetailAct) obj).onBackPressed();
                return unit;
            case 6:
                int i6 = ResultAct.i0;
                Intrinsics.f((View) it, "it");
                ResultAct resultAct = (ResultAct) obj;
                if (!resultAct.j() || resultAct.n().f13353e) {
                    resultAct.finish();
                } else {
                    resultAct.q(new z(resultAct, i2));
                }
                return unit;
            case 7:
                Resource resource = (Resource) it;
                CategoryDetailVM categoryDetailVM = (CategoryDetailVM) obj;
                categoryDetailVM.f13344i.set(false);
                boolean z3 = resource.f13285a;
                ArrayList arrayList = categoryDetailVM.f;
                if (z3 && (imageResponse = (ImageResponse) resource.f13286b) != null) {
                    arrayList.clear();
                    if (!imageResponse.getImages().isEmpty()) {
                        arrayList.addAll(imageResponse.getImages());
                    }
                }
                categoryDetailVM.f13342e.k(arrayList);
                return unit;
            case 8:
                Resource resource2 = (Resource) it;
                ImageCategoryVM imageCategoryVM = (ImageCategoryVM) obj;
                if (resource2.f13285a) {
                    ImageCategoryResponse imageCategoryResponse = (ImageCategoryResponse) resource2.f13286b;
                    if (imageCategoryResponse != null) {
                        for (ImageCategory imageCategory : imageCategoryResponse.getCategories()) {
                            ImageCategoryBean imageCategoryBean = new ImageCategoryBean();
                            imageCategoryBean.i(imageCategory.getId());
                            imageCategoryBean.j(imageCategory.getTitle());
                            imageCategoryVM.f.add(imageCategoryBean);
                        }
                        imageCategoryVM.d();
                    }
                } else {
                    imageCategoryVM.g.set(false);
                    imageCategoryVM.f13354e.k(imageCategoryVM.f);
                }
                return unit;
            case 9:
                CorruptionException ex = (CorruptionException) it;
                Intrinsics.f(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new SessionData(((SessionDataSerializer) obj).f21096a.a(null), (Time) null, (Map) null, 6, (DefaultConstructorMarker) null);
            case 10:
                return ((v) obj).c((vh) it);
            case 11:
                return ha.a((InputMethodManager) obj, (InputMethodInfo) it);
            case 12:
                return it == ((AbstractCollection) obj) ? "(this Collection)" : String.valueOf(it);
            case 13:
                Map.Entry it2 = (Map.Entry) it;
                Intrinsics.f(it2, "it");
                AbstractMap abstractMap = (AbstractMap) obj;
                StringBuilder sb = new StringBuilder();
                Object key = it2.getKey();
                sb.append(key == abstractMap ? "(this Map)" : String.valueOf(key));
                sb.append(dc.T);
                Object value = it2.getValue();
                sb.append(value != abstractMap ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 14:
                String it3 = (String) it;
                Intrinsics.f(it3, "it");
                ((ArrayList) obj).add(it3);
                return unit;
            case 15:
                KTypeProjection it4 = (KTypeProjection) it;
                Intrinsics.f(it4, "it");
                ((TypeReference) obj).getClass();
                KVariance kVariance = it4.f43352a;
                if (kVariance == null) {
                    return "*";
                }
                KType kType = it4.f43353b;
                TypeReference typeReference = kType instanceof TypeReference ? (TypeReference) kType : null;
                String strValueOf = (typeReference == null || (strA = typeReference.a(true)) == null) ? String.valueOf(kType) : strA;
                int i7 = TypeReference.WhenMappings.f43339a[kVariance.ordinal()];
                if (i7 == 1) {
                    return strValueOf;
                }
                if (i7 == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i7 == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                Intrinsics.f(it, "it");
                return ((Lambda) obj).invoke();
            case 17:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj;
                if (booleanRef.X || !Intrinsics.a(it, null)) {
                    z2 = true;
                } else {
                    booleanRef.X = true;
                }
                return Boolean.valueOf(z2);
            case 18:
                Function1 function1 = (Function1) obj;
                Throwable th2 = (Throwable) it;
                int i8 = ExceptionsConstructorKt.f45031a;
                try {
                    th = (Throwable) function1.invoke(th2);
                    boolean zA = Intrinsics.a(th2.getMessage(), th.getMessage());
                    objA = th;
                    if (!zA && !Intrinsics.a(th.getMessage(), th2.toString())) {
                        objA = th;
                        objA = null;
                    }
                } catch (Throwable th3) {
                    objA = ResultKt.a(th3);
                }
                objA = th;
                return (Throwable) (objA instanceof Result.Failure ? null : objA);
            case 19:
                return SerialDescriptorImpl.toString$lambda$3((SerialDescriptorImpl) obj, ((Integer) it).intValue());
            case 20:
                return ObjectSerializer.descriptor_delegate$lambda$1$lambda$0((ObjectSerializer) obj, (ClassSerialDescriptorBuilder) it);
            case 21:
                return PluginGeneratedSerialDescriptor.toString$lambda$6((PluginGeneratedSerialDescriptor) obj, ((Integer) it).intValue());
            case 22:
                return TripleSerializer.descriptor$lambda$0((TripleSerializer) obj, (ClassSerialDescriptorBuilder) it);
            case 23:
                return SerializersModuleCollector.DefaultImpls.contextual$lambda$0((KSerializer) obj, (List) it);
            case 24:
                int i9 = ChargingGuideDialog.Z;
                Intrinsics.f((View) it, "it");
                ((ChargingGuideDialog) obj).dismiss();
                return unit;
            default:
                int i10 = DownloadDialog.k0;
                Intrinsics.f((View) it, "it");
                ((DownloadDialog) obj).dismiss();
                return unit;
        }
    }

    public /* synthetic */ b(Object obj, int i2) {
        this.X = i2;
        this.f8276Y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(Function0 function0) {
        this.X = 16;
        this.f8276Y = (Lambda) function0;
    }
}
