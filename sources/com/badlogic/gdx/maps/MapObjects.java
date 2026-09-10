package com.badlogic.gdx.maps;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.reflect.ClassReflection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MapObjects implements Iterable<MapObject> {
    private Array<MapObject> objects = new Array<>();

    public void add(MapObject mapObject) {
        this.objects.add(mapObject);
    }

    public MapObject get(int i) {
        return this.objects.get(i);
    }

    public <T extends MapObject> Array<T> getByType(Class<T> cls) {
        return getByType(cls, new Array<>());
    }

    public int getCount() {
        return this.objects.size;
    }

    public int getIndex(String str) {
        return getIndex(get(str));
    }

    @Override // java.lang.Iterable
    public Iterator<MapObject> iterator() {
        return this.objects.iterator();
    }

    public void remove(int i) {
        this.objects.removeIndex(i);
    }

    public MapObject get(String str) {
        int i = this.objects.size;
        for (int i2 = 0; i2 < i; i2++) {
            MapObject mapObject = this.objects.get(i2);
            if (str.equals(mapObject.getName())) {
                return mapObject;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends MapObject> Array<T> getByType(Class<T> cls, Array<T> array) {
        array.clear();
        int i = this.objects.size;
        for (int i2 = 0; i2 < i; i2++) {
            MapObject mapObject = this.objects.get(i2);
            if (ClassReflection.isInstance(cls, mapObject)) {
                array.add(mapObject);
            }
        }
        return array;
    }

    public int getIndex(MapObject mapObject) {
        return this.objects.indexOf(mapObject, true);
    }

    public void remove(MapObject mapObject) {
        this.objects.removeValue(mapObject, true);
    }
}
