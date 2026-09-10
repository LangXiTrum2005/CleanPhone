package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f5734Y = 0;
    public final int X;

    public DataSourceException(int i2) {
        this.X = i2;
    }

    public DataSourceException(Exception exc, int i2) {
        super(exc);
        this.X = i2;
    }

    public DataSourceException(String str, int i2) {
        super(str);
        this.X = i2;
    }

    public DataSourceException(String str, Exception exc, int i2) {
        super(str, exc);
        this.X = i2;
    }
}
