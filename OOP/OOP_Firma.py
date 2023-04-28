class Personen:
    def __init__(self, Name, Alter, Geschlecht):
        self.Name = Name
        self.Alter = Alter
        self.Geschlecht = Geschlecht

class Mitarbeiter(Personen):
    def __init__(self, Name, Alter, Geschlecht, Abteilungsleiter, Firma):
        super(Mitarbeiter, self).__init__(Name, Alter, Geschlecht)
        self.Abteilungsleiter = Abteilungsleiter
        self.Firma = Firma

class Abteilungsleiter(Personen):
    def __init__(self, Name, Alter, Geschlecht, Firma):
        super(Abteilungsleiter, self).__init__(Name, Alter, Geschlecht)
        self.Firma = Firma

class Abteilung:
    def __init__(self, Name):
        self.Name = Name
    
class Firma:
    def __init__(self, Name):
        self.Name = Name
        self.abteilung = []
        self.mitarbeiter = []
        self.abteilungsleiter = []

    def anzMitarbeiter(self):
        return f'Es befinden sich {len(self.mitarbeiter)} in der Firma {self.Name}'

    def anzAbteilungen(self):
        return f'Es befinden sich {len(self.abteilung)} in der Firma {self.Name}'
    
    def anzAbteilungsleiter(self):
        return f'Es befinden sich {len(self.abteilungsleiter)} in der Firma {self.Name}'
    
    def mitarbeiterStärke(self):
        counter = 0
        for j in self.abteilung:
            for i in self.mitarbeiter:
                if i.Abteilung == Abteilung:
                    counter += 1
        return f'Die größte Abteilung hat {counter} Mitarbeiter'
            

    def männerFrauen(self):
        männer = 0
        frauen = 0
        counter = 0
        for i in self.mitarbeiter:
            if i.Geschlecht == "weiblich":
                frauen += 1
                counter += 1
            elif i.Geschlecht == "männlich":
                männer += 1
                counter += 1
        männerProzent = (männer/counter)*100
        frauenProzent = (frauen/counter)*100
        return f'Es arbeiten {männerProzent} Prozent Männer und {frauenProzent} Prozent Frauen'
        

if __name__ == '__main__':
    f = Firma("Swarovski")

    it = Abteilung("IT")
    Buchhaltung = Abteilung("Buchaaltung")
    f.abteilung.append(it)
    f.abteilung.append(Buchhaltung)

    a1 = Abteilungsleiter("Hans", 50, "männlich", f)
    a2 = Abteilungsleiter("Lisa", 30, "weiblich", f)
    f.abteilungsleiter.append(a1)
    f.abteilungsleiter.append(a2)

    m1 = Mitarbeiter("Luis", 50, "männlich", a1, f)
    f.mitarbeiter.append(m1)


    print(f.männerFrauen())
    print(f.anzAbteilungen())
    print(f.anzAbteilungsleiter())
    print(f.anzMitarbeiter())
    print(f.mitarbeiterStärke())

