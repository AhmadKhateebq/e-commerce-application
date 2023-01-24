
# this readme contains the classes design and the documentation for the methods
# each class has a model , repository , service and controller.
# each controller contains 4 methods ,2 gets , post and delete, they are described in this file.

# Classes:
## address{
     id,
    country,
     city,
     area,
     street
## }
## item{
     id,
     name,
     type_id,
     quantity   
}
## type{
     id,
     name
## }

#  *HTTP Methods* :
![image](https://user-images.githubusercontent.com/90826424/165402952-be9463f5-ac12-46b9-846c-4f836ec73c9a.png)

*_(requests and responses are in the collection JSON file attached)_*
# items requests
## GET : http://localhost:8080/item/ : 200OK : return all items 
## GET : http://localhost:8080/item/id : 200OK : return item with that id 
## POST : http://localhost:8080/item/ : 200OK : add item
## DELETE : http://localhost:8080/item/id : 200OK : delete item with that id 
__________________________________________________________________________
# addresses requests
## GET : http://localhost:8080/address/ : 200OK : return all addresses 
## GET : http://localhost:8080/address/id : 200OK : return addresses with that id 
## POST : http://localhost:8080/address/ : 200OK : add addresses 
## DELETE : http://localhost:8080/address/id : 200OK : delete address with that id 
__________________________________________________________________________
# types requests
## GET : http://localhost:8080/type/ : 200OK : return all types 
## GET : http://localhost:8080/type/id : 200OK : return types with that id 
## POST : http://localhost:8080/type/ : 200OK : add type
## DELETE : http://localhost:8080/type/id : 200OK : delete type with that id 
