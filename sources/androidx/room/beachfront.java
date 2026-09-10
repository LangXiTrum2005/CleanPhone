package androidx.room;

import android.content.Context;

/* JADX INFO: compiled from: Room.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {
    public static <T extends RoomDatabase> RoomDatabase.attabal<T> attabal(Context context, Class<T> cls, String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new RoomDatabase.attabal<>(context, cls, str);
    }

    public static <T extends RoomDatabase> RoomDatabase.attabal<T> dern(Context context, Class<T> cls) {
        return new RoomDatabase.attabal<>(context, cls, null);
    }

    public static <T, C> T saneness(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return (T) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }
}
