insert into brand(id, fullname, companyname, companyUrl) values(2000, 'Simon Vanleeuw', 'Cy-mon Software', 'www.cymon.com');

insert into brand(id, fullname, companyname, companyUrl) values(3000, 'Jimi Hendrix', 'Hendrix nv', 'www.hendrix.be');
insert into brand(id, fullname, companyname, companyUrl) values(4000, 'Elon Musk', 'Space X', 'www.spacex.com');
insert into brand(id, fullname, companyname, companyUrl) values(5000, 'Janis', 'Joplin Searches', 'www.joplin.com');
insert into brand(id, fullname, companyname, companyUrl) values(6000, 'Amy', 'Winehouse Mortuary', 'www.winehousemortuary.com');


insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(1000, 'Simon', 'Vanleeuw', 25, 'Male', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(2000, 'Janis', 'Joplin', 45, 'Female', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(3000, 'Jessica', 'Parker', 12, 'Female', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(4000, 'Helena', 'Montoya', 25, 'Female', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(5000, 'Ennoia', 'Ballard', 52, 'Male', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(6000, 'Eliah', 'Ballard', 18, 'Male', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(7000, 'Fibonacci', 'Series', 32, 'Female', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(8000, 'Harry', 'Goldfarb', 27, 'Male', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(9000, 'Sarah', 'Goldfarb', 72, 'Female', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(10000, 'Marion', 'Silver', 25, 'Female', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(11000, 'Don', 'Draper', 40, 'Male', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(12000, 'Penny', 'Gold', 27, 'Female', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(13000, 'Pete', 'Campbell', 35, 'Male', 1000, 2000);
insert into user(id, firstname, lastname, age, gender, followed_id, brand_id) values(14000, 'Alexander', 'The Great', 34, 'Male', 1000, 2000);

insert into interest(id, interest, interestLevel) values(1000, 'Design', 75);
insert into interest(id, interest, interestLevel) values(2000, 'Design', 25);
insert into interest(id, interest, interestLevel) values(3000, 'Design', 50);
insert into interest(id, interest, interestLevel) values(4000, 'Cooking', 80);
insert into interest(id, interest, interestLevel) values(5000, 'Cooking', 60);
insert into interest(id, interest, interestLevel) values(6000, 'Cooking', 40);
insert into interest(id, interest, interestLevel) values(7000, 'Cooking', 50);
insert into interest(id, interest, interestLevel) values(8000, 'Fishing', 90);
insert into interest(id, interest, interestLevel) values(9000, 'Fishing', 60);
insert into interest(id, interest, interestLevel) values(10000, 'Fishing', 40);
insert into interest(id, interest, interestLevel) values(11000, 'Instagram', 75);
insert into interest(id, interest, interestLevel) values(12000, 'Instagram', 80);
insert into interest(id, interest, interestLevel) values(13000, 'Instagram', 30);
insert into interest(id, interest, interestLevel) values(14000, 'Instagram', 20);

insert into user_interest(user_id, interest_id) values(1000, 1000);
insert into user_interest(user_id, interest_id) values(2000, 2000);
insert into user_interest(user_id, interest_id) values(3000, 3000);
insert into user_interest(user_id, interest_id) values(4000, 4000);
insert into user_interest(user_id, interest_id) values(5000, 5000);
insert into user_interest(user_id, interest_id) values(6000, 6000);
insert into user_interest(user_id, interest_id) values(7000, 7000);
insert into user_interest(user_id, interest_id) values(8000, 8000);
insert into user_interest(user_id, interest_id) values(9000, 9000);
insert into user_interest(user_id, interest_id) values(10000, 10000);
insert into user_interest(user_id, interest_id) values(11000, 11000);
insert into user_interest(user_id, interest_id) values(12000, 12000);
insert into user_interest(user_id, interest_id) values(13000, 13000);
insert into user_interest(user_id, interest_id) values(14000, 14000);

insert into webdevice(id, devicetype, devicename) values(1000, 'LAPTOP', 'Macbook Air3.0');
insert into webdevice(id, devicetype, devicename) values(2000, 'LAPTOP', 'Macbook Air2.0');
insert into webdevice(id, devicetype, devicename) values(3000, 'LAPTOP', 'Macbook Air1.0');
insert into webdevice(id, devicetype, devicename) values(4000, 'PHONE', 'Huawei 8.0 Lite');
insert into webdevice(id, devicetype, devicename) values(5000, 'PHONE', 'Huawei 5.0 Lite');
insert into webdevice(id, devicetype, devicename) values(6000, 'PHONE', 'Huawei 5.3 Lite');
insert into webdevice(id, devicetype, devicename) values(7000, 'PHONE', 'Huawei 7.0 Lite');
insert into webdevice(id, devicetype, devicename) values(8000, 'HOMECOMPUTER', 'Imac 3.5');
insert into webdevice(id, devicetype, devicename) values(9000, 'HOMECOMPUTER', 'Imac 4.0');
insert into webdevice(id, devicetype, devicename) values(10000, 'HOMECOMPUTER', 'Imac 5.5');
insert into webdevice(id, devicetype, devicename) values(11000, 'TABLET', 'Ipad 102');
insert into webdevice(id, devicetype, devicename) values(12000, 'TABLET', 'Ipad 300');
insert into webdevice(id, devicetype, devicename) values(13000, 'TABLET', 'Ipad 603');
insert into webdevice(id, devicetype, devicename) values(14000, 'TABLET', 'Ipad 201');

insert into user_webdevice(user_id, webdevice_id) values(1000, 1000);
insert into user_webdevice(user_id, webdevice_id) values(2000, 2000);
insert into user_webdevice(user_id, webdevice_id) values(3000, 3000);
insert into user_webdevice(user_id, webdevice_id) values(4000, 4000);
insert into user_webdevice(user_id, webdevice_id) values(5000, 5000);
insert into user_webdevice(user_id, webdevice_id) values(6000, 6000);
insert into user_webdevice(user_id, webdevice_id) values(7000, 7000);
insert into user_webdevice(user_id, webdevice_id) values(8000, 8000);
insert into user_webdevice(user_id, webdevice_id) values(9000, 9000);
insert into user_webdevice(user_id, webdevice_id) values(10000, 10000);
insert into user_webdevice(user_id, webdevice_id) values(11000, 11000);
insert into user_webdevice(user_id, webdevice_id) values(12000, 12000);
insert into user_webdevice(user_id, webdevice_id) values(13000, 13000);
insert into user_webdevice(user_id, webdevice_id) values(14000, 14000);

--insert into webDevice(id, devicetype, devicename, deviceUseRatio) values(1000, "PHONE", "Huawei Lite S800", 60);