package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/FileWriteScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.WriteScope
    public final Object d(Object obj, ContinuationImpl continuationImpl) {
        FileWriteScope$writeData$1 fileWriteScope$writeData$1;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (continuationImpl instanceof FileWriteScope$writeData$1) {
            fileWriteScope$writeData$1 = (FileWriteScope$writeData$1) continuationImpl;
            int i2 = fileWriteScope$writeData$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileWriteScope$writeData$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                fileWriteScope$writeData$1 = new FileWriteScope$writeData$1(this, continuationImpl);
            }
        } else {
            fileWriteScope$writeData$1 = new FileWriteScope$writeData$1(this, continuationImpl);
        }
        Object obj2 = fileWriteScope$writeData$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = fileWriteScope$writeData$1.f0;
        if (i3 == 0) {
            ResultKt.b(obj2);
            if (this.f4646c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f4644a);
            try {
                Serializer serializer = this.f4645b;
                UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream3);
                fileWriteScope$writeData$1.X = fileOutputStream3;
                fileWriteScope$writeData$1.f4658Y = fileOutputStream3;
                fileWriteScope$writeData$1.f0 = 1;
                if (serializer.writeTo(obj, uncloseableOutputStream, fileWriteScope$writeData$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = fileWriteScope$writeData$1.f4658Y;
            fileOutputStream = fileWriteScope$writeData$1.X;
            try {
                ResultKt.b(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    kotlin.io.CloseableKt.a(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        kotlin.io.CloseableKt.a(fileOutputStream, null);
        return Unit.f43263a;
    }
}
