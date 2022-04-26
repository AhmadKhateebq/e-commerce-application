# Classes:
## address{
###     id,
###     country,
###     city,
###     area,
###     street
## }
## item{
###     id,
###     name,
###     type_id,
###     quantity   
}
## type{
###     id,
###     name
## }

# ** *HTTP Methods* **:
![image](https://user-images.githubusercontent.com/90826424/165402952-be9463f5-ac12-46b9-846c-4f836ec73c9a.png)

(requests and responses are in the collection JSON file attached)
items requests
GET : http://localhost:8080/item/ : 200OK : return all items 
GET : http://localhost:8080/item/id : 200OK : return item with that id 
POST : http://localhost:8080/item/ : 200OK : return all items 
DELETE : http://localhost:8080/item/ : 200OK : return all items 
