package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3972lc0 implements InterfaceC3551gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f4654a;
    public final C4324pc0 b;
    public InputStream c;

    public C3972lc0(Uri uri, C4324pc0 c4324pc0) {
        this.f4654a = uri;
        this.b = c4324pc0;
    }

    public static C3972lc0 d(Context context, Uri uri, InterfaceC4148nc0 interfaceC4148nc0) {
        return new C3972lc0(uri, new C4324pc0(com.bumptech.glide.a.a(context).c.b().f(), interfaceC4148nc0, com.bumptech.glide.a.a(context).d, context.getContentResolver()));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final Class a() {
        return InputStream.class;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void c(IV iv, InterfaceC3463fl interfaceC3463fl) throws Throwable {
        try {
            InputStream inputStreamF = f();
            this.c = inputStreamF;
            interfaceC3463fl.k(inputStreamF);
        } catch (FileNotFoundException e) {
            interfaceC3463fl.d(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final EnumC4516rl e() {
        return EnumC4516rl.f4942a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public final InputStream f() throws Throwable {
        Cursor cursorA;
        String string;
        boolean zIsEmpty;
        ContentResolver contentResolver;
        File file;
        InputStream inputStreamOpenInputStream;
        int iC0;
        Uri uri = this.f4654a;
        C4324pc0 c4324pc0 = this.b;
        c4324pc0.getClass();
        Cursor cursor = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            cursorA = c4324pc0.f4841a.a(uri);
            if (cursorA != null) {
                try {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorA;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SecurityException unused) {
                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                        Objects.toString(uri);
                    }
                    if (cursorA != null) {
                    }
                    string = null;
                    zIsEmpty = TextUtils.isEmpty(string);
                    contentResolver = c4324pc0.c;
                    if (zIsEmpty) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            try {
                                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                iC0 = AbstractC2871Wx.c0(c4324pc0.b, inputStreamOpenInputStream2, c4324pc0.d);
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                            } catch (Throwable th2) {
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                throw th2;
                            }
                        } catch (IOException | NullPointerException unused4) {
                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                Objects.toString(uri);
                            }
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused5) {
                                }
                            }
                            iC0 = -1;
                            if (iC0 != -1) {
                                return new C4791us(inputStreamOpenInputStream, iC0);
                            }
                            return inputStreamOpenInputStream;
                        }
                    } else {
                        iC0 = -1;
                    }
                    if (iC0 != -1) {
                        return new C4791us(inputStreamOpenInputStream, iC0);
                    }
                    return inputStreamOpenInputStream;
                }
                zIsEmpty = TextUtils.isEmpty(string);
                contentResolver = c4324pc0.c;
                if (zIsEmpty) {
                    inputStreamOpenInputStream = null;
                } else {
                    file = new File(string);
                    if (file.exists() || 0 >= file.length()) {
                        inputStreamOpenInputStream = null;
                    } else {
                        Uri uriFromFile = Uri.fromFile(file);
                        try {
                            inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                        } catch (NullPointerException e) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
                        }
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                    iC0 = AbstractC2871Wx.c0(c4324pc0.b, inputStreamOpenInputStream2, c4324pc0.d);
                    if (inputStreamOpenInputStream2 != null) {
                        inputStreamOpenInputStream2.close();
                    }
                } else {
                    iC0 = -1;
                }
                if (iC0 != -1) {
                    return new C4791us(inputStreamOpenInputStream, iC0);
                }
                return inputStreamOpenInputStream;
            }
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (SecurityException unused6) {
            cursorA = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        string = null;
        zIsEmpty = TextUtils.isEmpty(string);
        contentResolver = c4324pc0.c;
        if (zIsEmpty) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
            iC0 = AbstractC2871Wx.c0(c4324pc0.b, inputStreamOpenInputStream2, c4324pc0.d);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            iC0 = -1;
        }
        if (iC0 != -1) {
            return new C4791us(inputStreamOpenInputStream, iC0);
        }
        return inputStreamOpenInputStream;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void cancel() {
    }
}
