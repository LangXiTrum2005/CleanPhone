package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public class SerializationException extends RuntimeException {
    private StringBuilder trace;

    public SerializationException() {
    }

    public void addTrace(String str) {
        if (str == null) {
            throw new IllegalArgumentException("info cannot be null.");
        }
        if (this.trace == null) {
            this.trace = new StringBuilder(512);
        }
        this.trace.append('\n');
        this.trace.append(str);
    }

    public boolean causedBy(Class cls) {
        return causedBy(this, cls);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.trace == null) {
            return super.getMessage();
        }
        StringBuilder stringBuilder = new StringBuilder(512);
        stringBuilder.append(super.getMessage());
        if (stringBuilder.length() > 0) {
            stringBuilder.append('\n');
        }
        stringBuilder.append("Serialization trace:");
        stringBuilder.append(this.trace);
        return stringBuilder.toString();
    }

    public SerializationException(String str, Throwable th) {
        super(str, th);
    }

    private boolean causedBy(Throwable th, Class cls) {
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return false;
        }
        if (cls.isAssignableFrom(cause.getClass())) {
            return true;
        }
        return causedBy(cause, cls);
    }

    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(Throwable th) {
        super("", th);
    }
}
