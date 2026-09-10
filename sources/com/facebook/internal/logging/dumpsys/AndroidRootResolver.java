package com.facebook.internal.logging.dumpsys;

import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver;", "", "Companion", "ListenableArrayList", "Listener", "Root", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidRootResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Field f16442c;
    public Field d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Companion;", "", "", "GET_DEFAULT_IMPL", "Ljava/lang/String;", "GET_GLOBAL_INSTANCE", "TAG", "VIEWS_FIELD", "WINDOW_MANAGER_GLOBAL_CLAZZ", "WINDOW_MANAGER_IMPL_CLAZZ", "WINDOW_PARAMS_FIELD", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Listener;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Listener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Root;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Root {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f16443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowManager.LayoutParams f16444b;

        public Root(View view, WindowManager.LayoutParams param) {
            Intrinsics.f(view, "view");
            Intrinsics.f(param, "param");
            this.f16443a = view;
            this.f16444b = param;
        }
    }

    public final ArrayList a() {
        if (!this.f16440a) {
            this.f16440a = true;
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Method method = cls.getMethod(Constants.GET_INSTANCE, new Class[0]);
                Intrinsics.e(method, "clazz.getMethod(instanceMethod)");
                this.f16441b = method.invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mViews");
                this.f16442c = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                Field declaredField2 = cls.getDeclaredField("mParams");
                this.d = declaredField2;
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
            } catch (ClassNotFoundException e2) {
                Log.d("AndroidRootResolver", String.format("could not find class: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal"}, 1)), e2);
            } catch (IllegalAccessException e3) {
                Log.d("AndroidRootResolver", String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal", Constants.GET_INSTANCE, "mViews"}, 3)), e3);
            } catch (NoSuchFieldException e4) {
                Log.d("AndroidRootResolver", String.format("could not find field: %s or %s on %s", Arrays.copyOf(new Object[]{"mParams", "mViews", "android.view.WindowManagerGlobal"}, 3)), e4);
            } catch (NoSuchMethodException e5) {
                Log.d("AndroidRootResolver", String.format("could not find method: %s on %s", Arrays.copyOf(new Object[]{Constants.GET_INSTANCE, "android.view.WindowManagerGlobal"}, 2)), e5);
            } catch (RuntimeException e6) {
                Log.d("AndroidRootResolver", String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal", Constants.GET_INSTANCE, "mViews"}, 3)), e6);
            } catch (InvocationTargetException e7) {
                Log.d("AndroidRootResolver", String.format("could not invoke: %s on %s", Arrays.copyOf(new Object[]{Constants.GET_INSTANCE, "android.view.WindowManagerGlobal"}, 2)), e7.getCause());
            }
        }
        Object obj = this.f16441b;
        if (obj == null) {
            Log.d("AndroidRootResolver", "No reflective access to windowmanager object.");
            return null;
        }
        Field field = this.f16442c;
        if (field == null) {
            Log.d("AndroidRootResolver", "No reflective access to mViews");
            return null;
        }
        if (this.d == null) {
            Log.d("AndroidRootResolver", "No reflective access to mPArams");
            return null;
        }
        try {
            List list = (List) field.get(obj);
            Field field2 = this.d;
            List list2 = (List) (field2 != null ? field2.get(this.f16441b) : null);
            ArrayList arrayList = new ArrayList();
            List list3 = EmptyList.X;
            if (list == null) {
                list = list3;
            }
            List list4 = list;
            if (list2 != null) {
                list3 = list2;
            }
            for (Pair pair : CollectionsKt.n0(list4, list3)) {
                arrayList.add(new Root((View) pair.X, (WindowManager.LayoutParams) pair.f43249Y));
            }
            return arrayList;
        } catch (IllegalAccessException e8) {
            Log.d("AndroidRootResolver", String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.f16442c, this.d, this.f16441b}, 3)), e8);
            return null;
        } catch (RuntimeException e9) {
            Log.d("AndroidRootResolver", String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.f16442c, this.d, this.f16441b}, 3)), e9);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$ListenableArrayList;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ListenableArrayList extends ArrayList<View> {
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            return super.add((View) obj);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return super.contains((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return super.indexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return super.lastIndexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return super.remove((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final Object remove(int i2) {
            return (View) super.remove(i2);
        }
    }
}
