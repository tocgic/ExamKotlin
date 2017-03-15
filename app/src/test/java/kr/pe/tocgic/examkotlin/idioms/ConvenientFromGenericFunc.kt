package kr.pe.tocgic.examkotlin.idioms

import com.google.gson.Gson

/**
 * Created by tocgic on 2017. 3. 15..
 *
 * Convenient form for a generic function that requires the generic type information
 */
class ConvenientFromGenericFunc {
//    public final class Gson {
//        ...
//        public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSystaxException {
//           ...
//        }
//    }

    inline fun <reified T: Any> Gson.fromJson(json): T = this.fromJson(json, T::class.java)
}
