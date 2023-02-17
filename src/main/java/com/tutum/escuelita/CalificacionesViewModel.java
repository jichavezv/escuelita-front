package com.tutum.escuelita;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.annotation.Command;

import com.tutum.escuelita.data.CalificacionesData;
import com.tutum.escuelita.model.Calificaciones;

public class CalificacionesViewModel {
	CalificacionesData data = new CalificacionesData();
	
	public CalificacionesData getData() {
		return data;
	}
	
	@Command
    @NotifyChange("data")
    public void revertCalificaciones() {
        data.revertDeletedCalificaciones();
    }
     
    @Command
    @NotifyChange("data")
    public void deleteAllCalificaciones() {
        data.deleteCalificaciones();
    }
     
    @Command
    @NotifyChange("data")
    public void removeCalificacion(@BindingParam("calif") Calificaciones myCalif) {
        data.deleteCalificaciones(myCalif);
    }
}
