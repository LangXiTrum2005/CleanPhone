package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.media.a;
import android.util.Log;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ljava/io/Closeable;", "Callback", "Configuration", "Factory", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SupportSQLiteOpenHelper extends Closeable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", "Builder", "Companion", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f8366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Callback f8368c;
        public final boolean d;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f8369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f8370b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Callback f8371c;
            public boolean d;

            public Builder(Context context) {
                Intrinsics.f(context, "context");
                this.f8369a = context;
            }

            public final Configuration a() {
                String str;
                Callback callback = this.f8371c;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.d && ((str = this.f8370b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new Configuration(this.f8369a, this.f8370b, callback, this.d);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Companion;", "", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public static Builder a(Context context) {
                Intrinsics.f(context, "context");
                return new Builder(context);
            }
        }

        public Configuration(Context context, String str, Callback callback, boolean z2) {
            Intrinsics.f(context, "context");
            Intrinsics.f(callback, "callback");
            this.f8366a = context;
            this.f8367b = str;
            this.f8368c = callback;
            this.d = z2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        SupportSQLiteOpenHelper a(Configuration configuration);
    }

    String getDatabaseName();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z2);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "", "Companion", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8365a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback$Companion;", "", "", "TAG", "Ljava/lang/String;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public Callback(int i2) {
            this.f8365a = i2;
        }

        public static void a(String str) {
            if (str.equalsIgnoreCase(":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.h(str.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e2) {
                Log.w("SupportSQLite", "delete failed: ", e2);
            }
        }

        public abstract void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i2, int i3) {
            throw new SQLiteException(a.g(i2, i3, "Can't downgrade database from version ", " to "));
        }

        public abstract void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i2, int i3);

        public void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }

        public void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }
    }
}
