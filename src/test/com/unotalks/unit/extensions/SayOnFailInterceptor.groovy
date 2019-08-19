package com.unotalks.unit.extensions

import com.unotalks.unit.TextToSpeech
import org.spockframework.runtime.extension.IMethodInterceptor
import org.spockframework.runtime.extension.IMethodInvocation
import org.spockframework.runtime.model.FeatureInfo

/**
 *
 * @author kensipe
 */
class SayOnFailInterceptor implements IMethodInterceptor {

    SayOnFail sayOnError
    FeatureInfo featureInfo

    SayOnFailInterceptor(SayOnFail sayOnError, FeatureInfo featureInfo) {
        this.sayOnError = sayOnError
        this.featureInfo = featureInfo
    }

    @Override
    void intercept(IMethodInvocation invocation) throws Throwable {
        try {
            invocation.proceed()
        } catch (Throwable t) {
            def methodName = featureInfo.getFeatureMethod().name
            try {
                TextToSpeech ts = new TextToSpeech();
                ts.sayMessage("La Prueba con el nombre: " + methodName + " ha fallado, este es un ejemplo de una extensión de Spock, Gracias!.");
            } catch (Exception ex) {
                ex.printStackTrace()
            }
            throw t
        }
    }}
