package web.practicas.demo.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService<E,ID extends Serializable> {
List<E>listall() throws Exception ;
Optional<E>listbyid(ID id)throws Exception;
void add(E entidad)throws Exception;
void update(ID id,E entidad)throws Exception;
void delete(ID id)throws Exception;


}
