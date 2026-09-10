package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.StatFs;
import com.chartboost.sdk.impl.e6;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class e6 implements o3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f13762e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f13764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13765c;
    public final Lazy d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            try {
                File cacheDir = e6.this.f13763a.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                File file = new File(cacheDir, e6.this.f13765c);
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (file.exists() && file.isDirectory()) {
                    return file;
                }
                return null;
            } catch (SecurityException e2) {
                za.b("SecurityException accessing or creating cache directory", e2);
                return null;
            } catch (Exception e3) {
                za.b("Error accessing or creating cache directory", e3);
                return null;
            }
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13767b;
        public final /* synthetic */ URL d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(URL url, Continuation continuation) {
            super(2, continuation);
            this.d = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e6.this.new c(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13767b;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            e6 e6Var = e6.this;
            File fileA = e6Var.a(this.d);
            File fileC = e6.this.c(this.d);
            this.f13767b = 1;
            Object objA = e6Var.a(fileA, fileC, this);
            return objA == coroutineSingletons ? coroutineSingletons : objA;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f13770c;
        public final /* synthetic */ File d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file, File file2, Continuation continuation) {
            super(2, continuation);
            this.f13770c = file;
            this.d = file2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f13770c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13769b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            boolean z2 = false;
            try {
                if (this.f13770c.exists()) {
                    this.f13770c.delete();
                }
                if (this.d.exists()) {
                    if (!this.d.delete()) {
                        za.e("Failed to delete data file: " + this.d.getAbsolutePath(), null, 2, null);
                        return Boolean.FALSE;
                    }
                    z2 = true;
                }
            } catch (Exception e2) {
                za.b("Error deleting cache files: " + this.d.getName(), e2);
            }
            return Boolean.valueOf(z2);
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f13772c;
        public final /* synthetic */ File d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(File file, File file2, Continuation continuation) {
            super(2, continuation);
            this.f13772c = file;
            this.d = file2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f13772c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zRenameTo;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13771b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                zRenameTo = this.f13772c.renameTo(this.d);
            } catch (Exception e2) {
                za.b("Error during finalizeDataFile (renameTo) from " + this.f13772c.getName() + " to " + this.d.getName(), e2);
                zRenameTo = false;
            }
            return Boolean.valueOf(zRenameTo);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13773b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e6.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13773b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            File fileB = e6.this.b();
            if (fileB == null) {
                return new Long(0L);
            }
            Ref.LongRef longRef = new Ref.LongRef();
            File[] fileArrListFiles = fileB.listFiles(new p008p.e());
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    za.e("Cleaning up stray temp file during init: " + file.getName(), null, 2, null);
                    try {
                        file.delete();
                    } catch (Exception e2) {
                        za.b("Failed to delete temp file " + file.getName() + " during init", e2);
                    }
                }
            }
            File[] fileArrListFiles2 = fileB.listFiles();
            if (fileArrListFiles2 != null) {
                e6 e6Var = e6.this;
                for (File file2 : fileArrListFiles2) {
                    try {
                        Intrinsics.c(file2);
                        if (e6Var.c(file2)) {
                            if (e6Var.a(file2).exists()) {
                                longRef.X += file2.length();
                            } else {
                                za.e("Metadata missing for " + file2.getName() + ", deleting data file.", null, 2, null);
                                file2.delete();
                            }
                        } else if (e6Var.d(file2) && !e6Var.b(file2).exists()) {
                            za.e("Data file missing for " + file2.getName() + ", deleting metadata file.", null, 2, null);
                            file2.delete();
                        }
                    } catch (Exception e3) {
                        za.b("Error processing file during init: " + file2.getAbsolutePath(), e3);
                    }
                }
            }
            return new Long(longRef.X);
        }

        public static final boolean a(File file) {
            if (file.isFile()) {
                String name = file.getName();
                Intrinsics.e(name, "getName(...)");
                if (StringsKt.p(name, ".tmp", false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13775b;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e6.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13775b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            File fileB = e6.this.b();
            if (fileB != null) {
                final e6 e6Var = e6.this;
                File[] fileArrListFiles = fileB.listFiles(new FileFilter() { // from class: p.f
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        return e6.g.a(e6Var, file);
                    }
                });
                if (fileArrListFiles != null) {
                    return ArraysKt.M(fileArrListFiles);
                }
            }
            return EmptyList.X;
        }

        public static final boolean a(e6 e6Var, File file) {
            Intrinsics.c(file);
            return e6Var.c(file);
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13777b;
        public final /* synthetic */ URL d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(URL url, Continuation continuation) {
            super(2, continuation);
            this.d = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e6.this.new h(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13777b;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            e6 e6Var = e6.this;
            File fileC = e6Var.c(this.d);
            this.f13777b = 1;
            Object objB = e6Var.b(fileC, this);
            return objB == coroutineSingletons ? coroutineSingletons : objB;
        }
    }

    public static final class i extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f13780c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(File file, Continuation continuation) {
            super(2, continuation);
            this.f13780c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.f13780c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13779b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            if (!this.f13780c.exists()) {
                return null;
            }
            try {
                return l3.f14390c.a(FilesKt.d(this.f13780c, Charsets.f44691a));
            } catch (IOException e2) {
                za.b("IOException reading metadata file " + this.f13780c.getName(), e2);
                return null;
            } catch (Exception e3) {
                za.b("Error reading metadata file " + this.f13780c.getName(), e3);
                return null;
            }
        }
    }

    public static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f13781b = new j();

        public j() {
            super(1);
        }

        public final CharSequence a(byte b2) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).byteValue());
        }
    }

    public static final class k extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f13783c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(File file, Continuation continuation) {
            super(2, continuation);
            this.f13783c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.f13783c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13782b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            boolean z2 = false;
            try {
                if (this.f13783c.exists()) {
                    this.f13783c.setLastModified(System.currentTimeMillis());
                    z2 = true;
                }
            } catch (Exception e2) {
                za.b("Failed to update access time for " + this.f13783c.getName(), e2);
            }
            return Boolean.valueOf(z2);
        }
    }

    public static final class l extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13784b;
        public final /* synthetic */ URL d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l3 f13786e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(URL url, l3 l3Var, Continuation continuation) {
            super(2, continuation);
            this.d = url;
            this.f13786e = l3Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e6.this.new l(this.d, this.f13786e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13784b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            File fileC = e6.this.c(this.d);
            File file = new File(fileC.getParentFile(), android.support.v4.media.a.m(fileC.getName(), ".tmp"));
            boolean z2 = false;
            try {
                FilesKt.g(file, this.f13786e.c(), Charsets.f44691a);
                if (file.renameTo(fileC)) {
                    z2 = true;
                } else {
                    za.b("Failed to rename temp metadata file " + file.getName() + " to " + fileC.getName(), (Throwable) null, 2, (Object) null);
                    file.delete();
                }
            } catch (IOException e2) {
                za.b("Failed to write metadata to temp file " + file.getName(), e2);
                file.delete();
            } catch (Exception e3) {
                za.b("Error writing metadata for " + fileC.getName(), e3);
                file.delete();
            }
            return Boolean.valueOf(z2);
        }
    }

    public e6(Context context, CoroutineDispatcher ioDispatcher, String cacheSubdir) {
        Intrinsics.f(context, "context");
        Intrinsics.f(ioDispatcher, "ioDispatcher");
        Intrinsics.f(cacheSubdir, "cacheSubdir");
        this.f13763a = context;
        this.f13764b = ioDispatcher;
        this.f13765c = cacheSubdir;
        this.d = LazyKt.b(new b());
    }

    public final boolean d(File file) {
        if (file.isFile() && file.exists()) {
            String name = file.getName();
            Intrinsics.e(name, "getName(...)");
            if (StringsKt.M(name, "cache_", false)) {
                String name2 = file.getName();
                Intrinsics.e(name2, "getName(...)");
                if (StringsKt.p(name2, ".meta", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.o3
    public Object a(URL url, Continuation continuation) {
        return BuildersKt.f(this.f13764b, new c(url, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.o3
    public Object b(File file, File file2, Continuation continuation) {
        return BuildersKt.f(this.f13764b, new e(file, file2, null), continuation);
    }

    public File c(URL url) {
        Intrinsics.f(url, "url");
        File fileB = b();
        if (fileB != null) {
            return new File(fileB, android.support.v4.media.a.m(b(url), ".meta"));
        }
        throw new IllegalArgumentException("Cache directory not available");
    }

    @Override // com.chartboost.sdk.impl.o3
    public Object a(File file, File file2, Continuation continuation) {
        return BuildersKt.f(this.f13764b, new d(file2, file, null), continuation);
    }

    public final File b() {
        return (File) this.d.getX();
    }

    @Override // com.chartboost.sdk.impl.o3
    public File a(URL url) {
        Intrinsics.f(url, "url");
        File fileB = b();
        if (fileB != null) {
            return new File(fileB, android.support.v4.media.a.m(b(url), ".dat"));
        }
        throw new IllegalArgumentException("Cache directory not available");
    }

    public final String b(URL url) {
        String string = url.toString();
        Intrinsics.e(string, "toString(...)");
        return android.support.v4.media.a.C("cache_", a(string));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e6(Context context, CoroutineDispatcher coroutineDispatcher, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = DefaultIoScheduler.f45062Y;
        }
        this(context, coroutineDispatcher, (i2 & 4) != 0 ? "managed_file_cache_v2" : str);
    }

    @Override // com.chartboost.sdk.impl.o3
    public Object b(Continuation continuation) {
        return BuildersKt.f(this.f13764b, new g(null), continuation);
    }

    @Override // com.chartboost.sdk.impl.o3
    public Object b(URL url, Continuation continuation) {
        return BuildersKt.f(this.f13764b, new h(url, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.o3
    public Object b(File file, Continuation continuation) {
        return BuildersKt.f(this.f13764b, new i(file, null), continuation);
    }

    public final File b(File file) {
        File parentFile = file.getParentFile();
        String name = file.getName();
        Intrinsics.e(name, "getName(...)");
        return new File(parentFile, StringsKt.E(name, ".meta").concat(".dat"));
    }

    public final boolean c(File file) {
        if (file.isFile() && file.exists()) {
            String name = file.getName();
            Intrinsics.e(name, "getName(...)");
            if (StringsKt.M(name, "cache_", false)) {
                String name2 = file.getName();
                Intrinsics.e(name2, "getName(...)");
                if (StringsKt.p(name2, ".dat", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.o3
    public File a() {
        return b();
    }

    @Override // com.chartboost.sdk.impl.o3
    public File a(File dataFile) {
        Intrinsics.f(dataFile, "dataFile");
        File parentFile = dataFile.getParentFile();
        String name = dataFile.getName();
        Intrinsics.e(name, "getName(...)");
        return new File(parentFile, StringsKt.E(name, ".dat").concat(".meta"));
    }

    @Override // com.chartboost.sdk.impl.o3
    public boolean a(long j2) {
        File fileB = b();
        if (fileB == null) {
            return false;
        }
        try {
            long availableBytes = new StatFs(fileB.getAbsolutePath()).getAvailableBytes();
            if (availableBytes >= j2) {
                return true;
            }
            za.e("Insufficient disk space. Available: " + availableBytes + " bytes, Required minimum: " + j2 + " bytes.", null, 2, null);
            return false;
        } catch (Exception e2) {
            za.b("Failed to check available disk space", e2);
            return false;
        }
    }

    @Override // com.chartboost.sdk.impl.o3
    public Object a(Continuation continuation) {
        return BuildersKt.f(this.f13764b, new f(null), continuation);
    }

    @Override // com.chartboost.sdk.impl.o3
    public Object a(File file, Continuation continuation) {
        return BuildersKt.f(this.f13764b, new k(file, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.o3
    public Object a(URL url, l3 l3Var, Continuation continuation) {
        return BuildersKt.f(this.f13764b, new l(url, l3Var, null), continuation);
    }

    public final String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.c(bArrDigest);
            return ArraysKt.H(bArrDigest, "", j.f13781b, 30);
        } catch (Exception e2) {
            za.b("Failed to compute SHA-256 for '" + str + "', falling back to hashCode", e2);
            int iAbs = Math.abs(str.hashCode());
            CharsKt.b(16);
            String string = Integer.toString(iAbs, 16);
            Intrinsics.e(string, "toString(...)");
            return string;
        }
    }
}
